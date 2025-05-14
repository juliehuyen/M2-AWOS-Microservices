package com.juliehuyen.productcomposition.controller;

import com.juliehuyen.productcomposition.dto.ProductCompositionDto;
import com.juliehuyen.productcomposition.service.ProductCompositionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product-compositions")
public class ProductCompositionController {

    private final ProductCompositionService productCompositionService;

    public ProductCompositionController(ProductCompositionService productCompositionService) {
        this.productCompositionService = productCompositionService;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductCompositionDto> getProductCompositionByProductId(@PathVariable("id") Long productId) {
        ProductCompositionDto productCompositionDto = productCompositionService.getProductCompositionByProductId(productId);
        return ResponseEntity.ok(productCompositionDto);
    }

}
