package com.juliehuyen.productcomposition.service.impl;

import com.juliehuyen.productcomposition.client.ProductClient;
import com.juliehuyen.productcomposition.client.RecommendationClient;
import com.juliehuyen.productcomposition.client.ReviewClient;
import com.juliehuyen.productcomposition.dto.ProductCompositionDto;
import com.juliehuyen.productcomposition.dto.ProductDto;
import com.juliehuyen.productcomposition.dto.RecommendationDto;
import com.juliehuyen.productcomposition.dto.ReviewDto;
import com.juliehuyen.productcomposition.service.ProductCompositionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductCompositionServiceImpl implements ProductCompositionService {

    private final ProductClient productClient;
    private final RecommendationClient recommendationClient;
    private final ReviewClient reviewClient;

    @Override
    public ProductCompositionDto getProductCompositionByProductId(Long productId) {

        // Récupérer un produit en appelant l'API
        ProductDto product = productClient.getProductById(productId);

        // Récupérer une review en appelant l'API
        ReviewDto review = reviewClient.getReviewById(productId);

        // Récupérer une recommendation en appelant l'API
        RecommendationDto recommendation = recommendationClient.getRecommendationByProductId(productId);

        // Construire à partir de nos deux objets la composition et la renvoyer
        return ProductCompositionDto.builder()
                .name(product.getName())
                .reviewId(review.getId())
                .recommendationId(recommendation.id()) // Record donc y a pas de guetter
                .build();
    }
}
