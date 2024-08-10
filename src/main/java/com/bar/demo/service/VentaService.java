package com.bar.demo.service;

import com.bar.demo.entity.Venta;
import com.bar.demo.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> getVentaById(int id) {
        return ventaRepository.findById(id);
    }

    public Venta saveOrUpdate(Venta venta) {
        return ventaRepository.save(venta);
    }

    public void deleteVenta(int id) {
        ventaRepository.deleteById(id);
    }

    public Venta updateVenta(int id, Venta updatedVenta) {
        if (ventaRepository.existsById(id)) {
            updatedVenta.setIdVenta(id);
            return ventaRepository.save(updatedVenta);
        }
        return null;
    }
}