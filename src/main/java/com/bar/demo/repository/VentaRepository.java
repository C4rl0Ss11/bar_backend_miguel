package com.bar.demo.repository;

import com.bar.demo.entity.Venta;
<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<Venta, Long> {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import java.util.Optional;


@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
    Optional<Venta> findById(Integer idVenta);
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
}
