package com.juliehuyen.productcomposition.client;

import com.juliehuyen.productcomposition.dto.ReviewDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "review-service", url = "http://localhost:8082") // On n'est pas obligé de mettre l'url car c'est déjà renseigné dans le registry Eureka
public interface ReviewClient {

    @GetMapping("/reviews/{id}")
    ReviewDto getReviewByProductId(@PathVariable("id") Long productId);
}
