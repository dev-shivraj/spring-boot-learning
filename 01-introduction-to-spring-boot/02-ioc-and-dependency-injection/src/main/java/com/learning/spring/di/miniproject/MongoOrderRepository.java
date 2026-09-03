package com.learning.spring.di.miniproject;

import org.springframework.stereotype.Repository;

@Repository
public class MongoOrderRepository implements OrderRepository{
    @Override
    public void save() {
        System.out.println("Order saved");
    }
}
