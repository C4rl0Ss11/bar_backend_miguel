package com.bar.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
=======
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@Data
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD
    private Long id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Double total;
    private int estado;


    ///////////////



    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<DetalleVenta> detalleVentaList = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name="id_client", nullable = false)
    @JsonIgnore
    private Client client;

    //Fecha actual
    @PrePersist
    protected void onCreate() {
        this.fecha = new Date();
    }
}
=======
    private Integer idVenta;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    private BigDecimal total;
    private Integer idCliente;
    private Boolean estado;
    private Integer mesa;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetalleVenta> detalleVenta = new ArrayList<>();


}
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
