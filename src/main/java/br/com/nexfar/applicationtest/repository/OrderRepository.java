package br.com.nexfar.applicationtest.repository;

import br.com.nexfar.applicationtest.model.Order;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> getAllByMainSellerId(ObjectId id);
}
