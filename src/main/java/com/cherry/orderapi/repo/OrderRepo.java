package com.cherry.orderapi.repo;


import com.cherry.orderapi.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo  extends MongoRepository<Order, Integer> {
}
