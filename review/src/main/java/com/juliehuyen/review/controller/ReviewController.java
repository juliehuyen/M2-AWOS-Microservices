package com.juliehuyen.review.controller;

import com.juliehuyen.review.entity.Review;
import com.juliehuyen.review.repository.ReviewRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewRepository repository;

    public ReviewController(ReviewRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/{id}")
    public Review getById(@PathVariable Long id) {
        return repository.findById(id).orElseThrow();
    }
}
