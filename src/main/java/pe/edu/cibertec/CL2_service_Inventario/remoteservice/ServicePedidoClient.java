package pe.edu.cibertec.CL2_service_Inventario.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="CL2-service-Pedidos")
public interface ServicePedidoClient {

    @GetMapping("/prueba-pedido")
   String obtenerPedidos();

}
