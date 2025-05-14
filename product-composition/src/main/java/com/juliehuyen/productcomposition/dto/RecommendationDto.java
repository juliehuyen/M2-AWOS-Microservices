package com.juliehuyen.productcomposition.dto;

public record RecommendationDto(Long id, Long productId, String author, Integer rate, String content) {
}
