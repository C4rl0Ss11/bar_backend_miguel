package com.bar.demo.repository;

import com.bar.demo.entity.DetalleVenta;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository


public interface DetalleVentaRepository extends CrudRepository <DetalleVenta, Long> {
    @Query("SELECT d FROM DetalleVenta d WHERE d.subtotal BETWEEN ?1 AND ?2")
    List<DetalleVenta> findDetalleVentaBySubtotalInRange(BigDecimal minPrice, BigDecimal maxPrice);

    // Consulta generada automáticamente usando subtotal
    List<DetalleVenta> findBySubtotalBetween(BigDecimal minPrice, BigDecimal maxPrice);
}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    List<DetalleVenta> findByVentaIdVenta(Integer idVenta);
}
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
