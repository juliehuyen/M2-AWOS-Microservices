package com.juliehuyen.productcomposition.service;

import com.juliehuyen.productcomposition.dto.ProductCompositionDto;

public interface ProductControllerService {
    ProductCompositionDto getProductCompositionByProductId(Long productId);
}
