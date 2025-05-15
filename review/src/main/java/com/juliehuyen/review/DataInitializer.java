package com.juliehuyen.review;

import com.juliehuyen.review.entity.Review;
import com.juliehuyen.review.repository.ReviewRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataInitializer {

    public DataInitializer(ReviewRepository reviewRepository) {
        reviewRepository.saveAll(List.of(
                Review.builder().id(1L).productId(1L).author("Joëlle").subject("Des frites trop chaudes...").content("Les frites étaient trop chaudes et m'ont brûlée la langue !").build(),
                Review.builder().id(2L).productId(2L).author("Julie").subject("Une salade bof.").content("J'aime pas la salade, ça manque de goût.").build()
        ));
    }
}
