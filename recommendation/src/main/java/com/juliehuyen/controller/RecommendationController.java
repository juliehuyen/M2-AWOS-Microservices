package com.juliehuyen.controller;

import com.juliehuyen.dto.RecommendationDto;
import com.juliehuyen.entity.Recommendation;
import com.juliehuyen.service.RecommendationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<RecommendationDto> getRecommendationByProductId(@PathVariable("id") Long productId) {
        Recommendation recommendation = recommendationService.getRecommendationByProductId(productId);
        RecommendationDto recommendationDto = RecommendationDto.mapToDTO(recommendation);
        return ResponseEntity.ok(recommendationDto);
    }
}
