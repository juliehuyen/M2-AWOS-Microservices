package com.juliehuyen.repository;

import com.juliehuyen.entity.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {

    Recommendation findRecommendationByProductId(Long productId);
}
