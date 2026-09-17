package com.learning.spring.scopes.singleton.practice1;

import org.springframework.stereotype.Component;

@Component
public class CounterService {
    private int count;

    public void increment() {
        ++count;
    }

    public int getCount() {
        return count;
    }
}
