package com.learning.spring.di.springbeanregister;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository {
    public void save() {
        System.out.println("Order Saved!");
    }
}
