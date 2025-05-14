package com.juliehuyen.productcomposition.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ReviewDto {

    private Long id;
    private Long productId;
    private String author;
    private String subject;
    private String content;
}
