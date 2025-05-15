package com.juliehuyen.product;

import com.juliehuyen.product.entity.Product;
import com.juliehuyen.product.repository.ProductRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ProductRepository productRepository) {
        productRepository.saveAll(List.of(
                Product.builder().id(1L).name("Frites").weight(1).build(),
                Product.builder().id(2L).name("Salade").weight(2).build()
        ));
    }
}
