package com.bar.demo.Controller;

import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<DetalleVenta> getById(@PathVariable("detalleVentaId") int detalleVentaId) {
        Optional<DetalleVenta> detalleVenta = detalleVentaService.getDetalleVentaById(detalleVentaId);
        return detalleVenta.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public DetalleVenta saveUpdate(@RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.saveOrUpdate(detalleVenta);
    }

    @PutMapping("/{detalleVentaId}")
    public ResponseEntity<DetalleVenta> updateDetalleVenta(@PathVariable("detalleVentaId") int detalleVentaId, @RequestBody DetalleVenta detalleVenta) {
        DetalleVenta updatedDetalleVenta = detalleVentaService.updateDetalleVenta(detalleVentaId, detalleVenta);
        return ResponseEntity.ok(updatedDetalleVenta);
    }

    @DeleteMapping("/{detalleVentaId}")
    public ResponseEntity<Void> delete(@PathVariable("detalleVentaId") int detalleVentaId) {
        detalleVentaService.deleteDetalleVenta(detalleVentaId);
        return ResponseEntity.noContent().build();
    }
}