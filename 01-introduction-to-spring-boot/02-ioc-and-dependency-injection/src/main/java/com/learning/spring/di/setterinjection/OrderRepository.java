package com.learning.spring.di.setterinjection;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save() {
        System.out.println("Order Saved!");
    }
}
