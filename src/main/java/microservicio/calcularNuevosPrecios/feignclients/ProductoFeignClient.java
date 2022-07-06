package microservicio.calcularNuevosPrecios.feignclients;

import microservicio.calcularNuevosPrecios.model.Producto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "producto-service")
public interface ProductoFeignClient {

    @GetMapping("/productos")
    List<Producto> getProducts();
}
