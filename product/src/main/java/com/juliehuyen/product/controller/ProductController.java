package com.juliehuyen.product.controller;

import com.juliehuyen.product.dto.ProductDto;
import com.juliehuyen.product.entity.Product;
import com.juliehuyen.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long id) {
        Product product = productService.getById(id);
        ProductDto productDto = ProductDto.mapToDTO(product);
        return ResponseEntity.ok(productDto);
    }
}
