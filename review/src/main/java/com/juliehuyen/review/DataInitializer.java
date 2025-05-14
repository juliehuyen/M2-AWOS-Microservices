package com.juliehuyen.review;

import com.juliehuyen.review.entity.Review;
import com.juliehuyen.review.repository.ReviewRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ReviewRepository reviewRepository) {
        reviewRepository.saveAll(List.of(
                Review.builder().id(1L).productId(1L).author("Julie").subject("Subject 1").content("Good").build(),
                Review.builder().id(2L).productId(1L).author("Joëlle").subject("Subject 2").content("Okay").build()
        ));
    }
}
