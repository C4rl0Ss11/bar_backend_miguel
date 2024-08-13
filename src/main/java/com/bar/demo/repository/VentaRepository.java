package com.bar.demo.repository;

import com.bar.demo.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;


@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
    Optional<Venta> findById(Integer idVenta);
}
