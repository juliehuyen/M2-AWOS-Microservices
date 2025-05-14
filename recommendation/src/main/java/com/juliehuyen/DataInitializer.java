package com.juliehuyen;

import com.juliehuyen.entity.Recommendation;
import com.juliehuyen.repository.RecommendationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(RecommendationRepository recommendationRepository) {
        recommendationRepository.saveAll(List.of(
                Recommendation.builder().id(1L).productId(1L).author("Julie").rate(3).content("Good").build(),
                Recommendation.builder().id(2L).productId(2L).author("Joëlle").rate(4).content("Very good").build()
        ));
    }
}
