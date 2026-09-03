package com.learning.spring.di.collectioninjection;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save() {
        System.out.println("Order Saved!");
    }
}
