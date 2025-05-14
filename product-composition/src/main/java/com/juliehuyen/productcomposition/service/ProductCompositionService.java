package com.juliehuyen.productcomposition.service;

import com.juliehuyen.productcomposition.dto.ProductCompositionDto;

public interface ProductCompositionService {

    ProductCompositionDto getProductCompositionByProductId(Long productId);
}
