package com.springtransaction.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableTransactionManagement
public class SpringTransactionExample {
    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionExample.class, args);
    }
}
