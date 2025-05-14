package com.juliehuyen.productcomposition.client;

import com.juliehuyen.productcomposition.dto.RecommendationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "recommendation-service", url = "http://localhost:8083")
public interface RecommendationClient {

    @GetMapping("/recommendations/products/{id}")
    RecommendationDto getRecommendationByProductId(@PathVariable("id") Long productId);
}
