package com.bar.demo.entity;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "detalle_venta")

public class DetalleVenta {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     private Double subtotal;
     private Integer cantidad;


     @ManyToOne
     @JoinColumn(name="id_venta", nullable = false)
     @JsonIgnore
    private Venta venta;

    @ManyToOne
    @JoinColumn(name="id_product", nullable = false)
    @JsonIgnore
    private Product product;



}
=======
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "detalleventa")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalleVenta;
    private Integer idProducto;
    private Integer cantidad;
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "idVenta", nullable = false)
    private Venta venta;
}

>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
