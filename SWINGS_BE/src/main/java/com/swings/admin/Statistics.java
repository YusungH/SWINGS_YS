package com.swings.admin;

import com.swings.product.Product;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Statistics")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salesId;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Product product;

    private Integer totalQuantity;
    private Integer totalPrice;
    private LocalDateTime soldStamp = LocalDateTime.now();
    private Integer productSale;
    private Integer productStock;

}
