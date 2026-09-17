package com.learning.spring.scopes.singleton.example2;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyService {
    public LazyService() {
        System.out.println("LazyService constructor called.");
    }
    public void execute() {
        System.out.println("Lazy service executing...");
    }
}
