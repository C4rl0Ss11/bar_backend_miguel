package com.bar.demo.entity;

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
