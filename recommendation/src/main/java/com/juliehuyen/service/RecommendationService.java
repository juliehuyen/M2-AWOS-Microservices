package com.juliehuyen.service;

import com.juliehuyen.entity.Recommendation;

public interface RecommendationService {

    Recommendation getRecommendationByProductId(Long productId);
}
