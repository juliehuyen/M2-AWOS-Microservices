package com.juliehuyen.productcomposition.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private Long id;
    private String name;
    private int weight;
}
