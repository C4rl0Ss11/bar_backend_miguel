package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "producto")

public class Product {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private String name;
     private BigDecimal price;
     private Integer stock;


     @ManyToOne
     @JoinColumn(name="id_categoria", nullable = false)
     @JsonIgnore
    private Maker maker;

}
