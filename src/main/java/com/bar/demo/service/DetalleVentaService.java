package com.bar.demo.service;

import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.repository.DetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    public List<DetalleVenta> getAllDetalleVentas() {
        return detalleVentaRepository.findAll();
    }

    public List<DetalleVenta> getAllDetalleVentasByVentaId(Integer ventaId) {
        return detalleVentaRepository.findByVentaIdVenta(ventaId);
    }

    public Optional<DetalleVenta> getDetalleVentaById(Integer id) {
        return detalleVentaRepository.findById(id);
    }

    public DetalleVenta saveOrUpdate(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    public void deleteDetalleVenta(Integer id) {
        detalleVentaRepository.deleteById(id);
    }

    public DetalleVenta updateDetalleVenta(Integer id, DetalleVenta updatedDetalleVenta) {
        if (detalleVentaRepository.existsById(id)) {
            updatedDetalleVenta.setIdDetalleVenta(id);
            return detalleVentaRepository.save(updatedDetalleVenta);
        }
        return null;
    }
}
