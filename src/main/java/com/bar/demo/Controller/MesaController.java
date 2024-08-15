package com.bar.demo.Controller;

import com.bar.demo.entity.Mesa;
import com.bar.demo.service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/mesa")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    @GetMapping
    public List<Mesa> getAll() {
        return mesaService.getAllMesas();
    }

    @GetMapping("/{mesaId}")
    public ResponseEntity<Mesa> getById(@PathVariable("mesaId") int mesaId) {
        Optional<Mesa> mesa = mesaService.getMesaById(mesaId);
        return mesa.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }


}