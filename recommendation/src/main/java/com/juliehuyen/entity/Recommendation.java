package com.juliehuyen.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Recommendation {

    @Id
    private Long id;
    private Long productId;
    private String author;
    private Integer rate;
    private String content;
}
