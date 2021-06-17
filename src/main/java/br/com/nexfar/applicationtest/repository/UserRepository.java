package br.com.nexfar.applicationtest.repository;

import br.com.nexfar.applicationtest.model.UserModel;
import org.bson.BsonString;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, String> {
    UserModel findByLogin(BsonString login);
}
