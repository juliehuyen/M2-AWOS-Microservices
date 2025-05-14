package com.juliehuyen.product.service.impl;

import com.juliehuyen.product.entity.Product;
import com.juliehuyen.product.repository.ProductRepository;
import com.juliehuyen.product.service.ProductService;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
