package com.juliehuyen.productcomposition.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {

    private Long id;
    private Long productId;
    private String author;
    private String subject;
    private String content;
}
