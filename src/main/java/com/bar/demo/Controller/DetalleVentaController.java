package com.bar.demo.Controller;

<<<<<<< HEAD
import com.bar.demo.Controller.dto.DetalleVentaDTO;
import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.service.IDetalleVentaService;
=======
import com.bar.demo.entity.DetalleVenta;
import com.bar.demo.service.DetalleVentaService;
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
import java.net.URI;
import java.net.URISyntaxException;
=======
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
import java.util.List;
import java.util.Optional;

@RestController
<<<<<<< HEAD
@RequestMapping("/api/detalle")
public class DetalleVentaController {

    @Autowired
    private IDetalleVentaService detalleVentaService;


    @GetMapping("/find/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id) {
        Optional<DetalleVenta> detalleVentaOptional = detalleVentaService.findById(id);

        if(detalleVentaOptional.isPresent()) {
            DetalleVenta detalleVenta = detalleVentaOptional.get();
            DetalleVentaDTO detalleVentaDTO = DetalleVentaDTO.builder()
                    .id(detalleVenta.getId())
                    .subtotal(detalleVenta.getSubtotal())
                    .cantidad(detalleVenta.getCantidad())
                    .venta(detalleVenta.getVenta())
                    .product(detalleVenta.getProduct())
                    .build();
            return ResponseEntity.ok(detalleVentaDTO);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<DetalleVentaDTO> detalleVentaList = detalleVentaService.findAll()
        .stream()
                .map(detalleVenta -> DetalleVentaDTO.builder()
                .id(detalleVenta.getId())
                        .subtotal(detalleVenta.getSubtotal())
                                .cantidad(detalleVenta.getCantidad())
                                .venta(detalleVenta.getVenta())
                                .product(detalleVenta.getProduct())
                                .build()
                ).toList();
        return ResponseEntity.ok(detalleVentaList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody DetalleVentaDTO detalleVentaDTO) throws URISyntaxException {
        if( detalleVentaDTO.getSubtotal() ==null || detalleVentaDTO.getCantidad() ==null ||  detalleVentaDTO.getVenta() == null || detalleVentaDTO.getProduct() == null){
    return ResponseEntity.badRequest().build();
        }
        DetalleVenta detalleVenta = DetalleVenta.builder()
                .subtotal(detalleVentaDTO.getSubtotal())
                .cantidad(detalleVentaDTO.getCantidad())
                .venta(detalleVentaDTO.getVenta())
                .product(detalleVentaDTO.getProduct())
                .build();

        detalleVentaService.save(detalleVenta);
        return ResponseEntity.created(new URI("/api/detalle/find")).build();

    }
    @PostMapping("/saveMultiple")
    public ResponseEntity<?> saveMultiple(@RequestBody List<DetalleVentaDTO> detalleVentaDTOList) throws URISyntaxException {
        if(detalleVentaDTOList == null || detalleVentaDTOList.isEmpty()) {
            return ResponseEntity.badRequest().build();
        }

        for(DetalleVentaDTO detalleVentaDTO : detalleVentaDTOList) {
            if(detalleVentaDTO.getSubtotal() == null || detalleVentaDTO.getCantidad() == null || detalleVentaDTO.getVenta() == null || detalleVentaDTO.getProduct() == null) {
                return ResponseEntity.badRequest().build();
            }

            DetalleVenta detalleVenta = DetalleVenta.builder()
                    .subtotal(detalleVentaDTO.getSubtotal())
                    .cantidad(detalleVentaDTO.getCantidad())
                    .venta(detalleVentaDTO.getVenta())
                    .product(detalleVentaDTO.getProduct())
                    .build();

            detalleVentaService.save(detalleVenta);
        }

        return ResponseEntity.created(new URI("/api/detalle/find")).build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?>update(@PathVariable Long id, @RequestBody DetalleVentaDTO detalleVentaDTO) {

        Optional<DetalleVenta> detalleVentaOptional = detalleVentaService.findById(id);

        if(detalleVentaOptional.isPresent()) {
            DetalleVenta detalleVenta = detalleVentaOptional.get();
            detalleVenta.setSubtotal(detalleVentaDTO.getSubtotal());
            detalleVenta.setCantidad(detalleVentaDTO.getCantidad());
            detalleVenta.setVenta(detalleVentaDTO.getVenta());
            detalleVenta.setProduct(detalleVentaDTO.getProduct());
            detalleVentaService.save(detalleVenta);
            return ResponseEntity.ok("Registro Actualizado");
        }
            return ResponseEntity.notFound().build();

        }

@DeleteMapping("/delete/{id}")


        public ResponseEntity<?> deleteById(@PathVariable Long id){

            if(id != null){
                detalleVentaService.deleteById(id);
                return ResponseEntity.ok("Registro eliminado");
            }
            return ResponseEntity.badRequest().build();
        }

    }


=======
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
>>>>>>> 7c669b89111448140bd76d3866b2563fe1316aa3
