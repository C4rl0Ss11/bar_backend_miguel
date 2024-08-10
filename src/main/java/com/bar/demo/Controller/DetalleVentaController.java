package com.bar.demo.Controller;

import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/detalleventa")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public List<DetalleVenta> getAll() {
        return detalleVentaService.getAllDetalleVentas();
    }

    @GetMapping("/{detalleVentaId}")
    public Optional<DetalleVenta> getById(@PathVariable("detalleVentaId") int detalleVentaId) {
        return detalleVentaService.getDetalleVentaById(detalleVentaId);
    }

    @PostMapping
    public DetalleVenta saveUpdate(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.saveOrUpdate(detalleVenta);
    }

    @PutMapping("/{detalleVentaId}")
    public DetalleVenta updateDetalleVenta(@PathVariable("detalleVentaId") int detalleVentaId, @RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.updateDetalleVenta(detalleVentaId, detalleVenta);
    }

    @DeleteMapping("/{detalleVentaId}")
    public void delete(@PathVariable("detalleVentaId") int detalleVentaId) {
        detalleVentaService.deleteDetalleVenta(detalleVentaId);
    }
}