package com.juliehuyen.review.repository;

import com.juliehuyen.review.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    Review findByProductId(Long productId);
}
