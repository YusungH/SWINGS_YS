package com.swings.product;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @Column(nullable = false)
    private String pName;

    @Column(nullable = false)
    private String pCategory;

    @Column(nullable = false)
    private Integer pPrice;

    @Column(nullable = false, length = 4000)
    private String pContent;

    @Column(nullable = false)
    private String pImage;

    private LocalDateTime pRegDate = LocalDateTime.now();

    @Column(nullable = false)
    private String pBrand;
}