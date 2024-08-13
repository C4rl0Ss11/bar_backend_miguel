package com.bar.demo.Controller;

import com.bar.demo.entity.Venta;
import com.bar.demo.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Venta> getById(@PathVariable("ventaId") int ventaId) {
        Optional<Venta> venta = ventaService.getVentaById(ventaId);
        return venta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Venta saveUpdate(@RequestBody Venta venta) {
        return ventaService.saveOrUpdate(venta);
    }

    @PutMapping("/{ventaId}")
    public ResponseEntity<Venta> updateVenta(@PathVariable("ventaId") int ventaId, @RequestBody Venta venta) {
        Venta updatedVenta = ventaService.updateVenta(ventaId, venta);
        return ResponseEntity.ok(updatedVenta);
    }

    @DeleteMapping("/{idVenta}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Integer idVenta) {
        ventaService.deleteVenta(idVenta);
        return ResponseEntity.noContent().build();
    }
}