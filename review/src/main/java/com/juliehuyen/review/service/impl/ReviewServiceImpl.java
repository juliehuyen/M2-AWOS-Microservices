package com.juliehuyen.review.service.impl;

import com.juliehuyen.review.entity.Review;
import com.juliehuyen.review.repository.ReviewRepository;
import com.juliehuyen.review.service.ReviewService;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository repository;

    public ReviewServiceImpl(ReviewRepository repository) {
        this.repository = repository;
    }

    @Override
    public Review getById(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
