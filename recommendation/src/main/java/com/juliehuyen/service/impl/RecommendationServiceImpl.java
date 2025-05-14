package com.juliehuyen.service.impl;

import com.juliehuyen.entity.Recommendation;
import com.juliehuyen.repository.RecommendationRepository;
import com.juliehuyen.service.RecommendationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    private final RecommendationRepository repository;

    @Override
    public Recommendation getRecommendationByProductId(Long productId) {
        return repository.findRecommendationByProductId(productId);
    }
}
