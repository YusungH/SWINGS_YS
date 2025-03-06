package com.swings.fit;

import com.swings.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "FitData")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FitData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fittingId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Enumerated(EnumType.STRING)
    private SwingType swingType;

    private Float ballSpeed;
    private Float headSpeed;
    private Float height;

}
