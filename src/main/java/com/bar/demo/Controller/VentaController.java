package com.bar.demo.Controller;

import com.bar.demo.entity.Venta;
import com.bar.demo.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/venta")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public List<Venta> getAll() {
        return ventaService.getAllVentas();
    }

    @GetMapping("/{ventaId}")
    public Optional<Venta> getById(@PathVariable("ventaId") int ventaId) {
        return ventaService.getVentaById(ventaId);
    }

    @PostMapping
    public Venta saveUpdate(@RequestBody Venta venta) {
        return ventaService.saveOrUpdate(venta);
    }

    @PutMapping("/{ventaId}")
    public Venta updateVenta(@PathVariable("ventaId") int ventaId, @RequestBody Venta venta) {
        return ventaService.updateVenta(ventaId, venta);
    }

    @DeleteMapping("/{ventaId}")
    public void delete(@PathVariable("ventaId") int ventaId) {
        ventaService.deleteVenta(ventaId);
    }
}