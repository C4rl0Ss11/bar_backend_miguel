package com.bar.demo.service;

import com.bar.demo.entity.Venta;
import com.bar.demo.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> getVentaById(int idVenta) {
        return ventaRepository.findById(idVenta);
    }

    public Venta saveOrUpdate(Venta venta) {
        if (venta.getFecha() == null) {
            venta.setFecha(new Date());  // Establece la fecha actual si no se proporciona
        }
        return ventaRepository.save(venta);
    }

    public Venta updateVenta(int idVenta, Venta venta) {
        Venta existingVenta = ventaRepository.findById(idVenta).orElseThrow();
        existingVenta.setFecha(venta.getFecha() != null ? venta.getFecha() : existingVenta.getFecha());
        existingVenta.setTotal(venta.getTotal());
        existingVenta.setIdCliente(venta.getIdCliente());
        existingVenta.setEstado(venta.getEstado());
        return ventaRepository.save(existingVenta);
    }

    public void deleteVenta(int idVenta) {
        ventaRepository.deleteById(idVenta);
    }
}