package com.juliehuyen.review.controller;

import com.juliehuyen.review.entity.Review;
import com.juliehuyen.review.repository.ReviewRepository;
import com.juliehuyen.review.service.ReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/{id}")
    public Review getReviewByProductId(@PathVariable("id") Long productId) {
        return reviewService.getByProductId(productId);
    }
}
