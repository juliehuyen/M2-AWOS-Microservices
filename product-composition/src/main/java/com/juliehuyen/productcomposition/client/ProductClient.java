package com.juliehuyen.productcomposition.client;

import com.juliehuyen.productcomposition.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8081") // On n'est pas obligé de mettre l'url car c'est déjà renseigné dans le registry Eureka
public interface ProductClient {

    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);
}
