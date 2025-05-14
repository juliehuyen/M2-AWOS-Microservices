package com.juliehuyen.productcomposition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductCompositionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCompositionApplication.class, args);
    }
}
