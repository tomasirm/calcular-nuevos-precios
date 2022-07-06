package microservicio.calcularNuevosPrecios.service;

import microservicio.calcularNuevosPrecios.feignclients.ProductoFeignClient;
import microservicio.calcularNuevosPrecios.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class CalcularNuevosPreciosService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProductoFeignClient productoFeignClient;

    public List<Producto> calcularNuevosPrecios(){
        String url = "http://producto-service/productos";
        double valorDolar = 850;
        double valorEuro = 900;

        List<Producto> productos = productoFeignClient.getProducts();

        for (Producto producto : productos) {
            producto.setPrecioDolares(producto.getPrecio()/valorDolar);
            producto.setPrecioEuros(producto.getPrecio()/valorEuro);
        }

        return productos;
    }
}
