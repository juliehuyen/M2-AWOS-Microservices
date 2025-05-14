package com.juliehuyen.productcomposition.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ProductCompositionDto {

    private String name;
    private Long reviewId;
    private Long recommendationId;
}
