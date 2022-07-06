package microservicio.calcularNuevosPrecios.controller;

import microservicio.calcularNuevosPrecios.model.Producto;
import microservicio.calcularNuevosPrecios.service.CalcularNuevosPreciosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/calcular-nuevos-precios")
public class CalcularNuevosPreciosController {

    @Autowired
    CalcularNuevosPreciosService calcularNuevosPreciosService;


    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Producto>> calcularNuevosPreciosService() {
        List<Producto> productos = calcularNuevosPreciosService.calcularNuevosPrecios();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }
}
