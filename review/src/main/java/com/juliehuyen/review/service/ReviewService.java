package com.juliehuyen.review.service;

import com.juliehuyen.review.entity.Review;

public interface ReviewService {

    Review getByProductId(Long productId);
}
