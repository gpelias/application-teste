package br.com.nexfar.applicationtest.service;

import br.com.nexfar.applicationtest.model.UserModel;
import br.com.nexfar.applicationtest.payload.Search;
import br.com.nexfar.applicationtest.repository.UserRepository;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.BsonDateTime;
import org.bson.BsonString;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private final UserRepository userRepository;
    private final MongoClient mongoClient;

    public OrderService(UserRepository userRepository, MongoClient mongoClient) {
        this.userRepository = userRepository;
        this.mongoClient = mongoClient;
    }

    public List<Document> list(String email) {
        List<Document> orderList = new ArrayList<>();
        UserModel user = userRepository.findByLogin(new BsonString(email));
        Document query = new Document();

        query.put("mainSeller.id", user.get_id());

        return getDocuments(query);
    }

    public List<Document> search(String email, Search search) {
        UserModel user = userRepository.findByLogin(new BsonString(email));
        Document query = new Document();
        Document createdAt = new Document();

        createdAt.put("$gte", new BsonDateTime(search.getBegin().getTime()));
        createdAt.put("$lt", new BsonDateTime(search.getEnd().getTime()));

        query.put("mainSeller.id", user.get_id());
        query.put("createdAt", createdAt);

        return getDocuments(query);
    }

    public Long total(String email) {
        UserModel user = userRepository.findByLogin(new BsonString(email));
        Document query = new Document("mainSeller.id", user.get_id());

        return getDocumentQuantity(query);
    }

    public List<Document> totalByClient(String email) {
        UserModel user = userRepository.findByLogin(new BsonString(email));
        List<Document> orderList = new ArrayList<>();
        List<Document> queryList = new ArrayList<>();

        Document firstStage = new Document();
        Document secondStage = new Document();
        Document match = new Document();
        Document group = new Document();
        Document sum = new Document();

        match.put("mainSeller.id", user.get_id());

        firstStage.put("$match", match);

        sum.put("$sum", 1);

        group.put("_id", "$client.id");
        group.put("count", sum);
        secondStage.put("$group", group);

        queryList.add(firstStage);
        queryList.add(secondStage);


        AggregateIterable<Document> aggregate = getCodecRegistry().getCollection("order").aggregate(queryList);

        if (aggregate != null) {
            MongoCursor<Document> cursor = aggregate.cursor();
            while (cursor.hasNext()) {
                orderList.add(cursor.next());
            }
            if (!cursor.hasNext()) {
                cursor.close();
            }
        }


        return orderList;

    }

    private MongoDatabase getCodecRegistry() {
        return mongoClient.getDatabase("nexfar")
                .withCodecRegistry(
                        CodecRegistries
                                .fromRegistries(MongoClientSettings
                                        .getDefaultCodecRegistry(), CodecRegistries
                                        .fromProviders(
                                                PojoCodecProvider
                                                        .builder()
                                                        .automatic(true)
                                                        .build())));
    }

    private List<Document> getDocuments(Document query) {
        List<Document> orderList = new ArrayList<>();
        FindIterable<Document> find = getCodecRegistry().getCollection("order").find(query);

        if (find != null) {
            MongoCursor<Document> cursor = find.cursor();
            while (cursor.hasNext()) {
                orderList.add(cursor.next());
            }
            if (!cursor.hasNext()) {
                cursor.close();
            }
        }
        return orderList;
    }

    private Long getDocumentQuantity(Document query) {
        return getCodecRegistry().getCollection("order").countDocuments(query);
    }

}
