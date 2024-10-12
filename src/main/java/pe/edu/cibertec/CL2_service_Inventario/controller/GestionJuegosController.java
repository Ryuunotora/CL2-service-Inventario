package pe.edu.cibertec.CL2_service_Inventario.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.CL2_service_Inventario.remoteservice.ServicePedidoClient;

@RequiredArgsConstructor
@RestController
public class GestionJuegosController {

    private final ServicePedidoClient servicePedidoClient;

    @GetMapping("/añadir-juego")
    public String añadirJuego(@RequestParam String juego){
        return "Juego  " + juego + "  añadido con exito";
    }

    @GetMapping("/listar-juegos")
    public String listarClientes(){
        return "Lista de Juegos: " +
                " The Legend Of Zelda: Tears Of The Kingdom, " +
                " Pokemon Escarlata, " +
                " Kirby and the Forgotten Land ";
    }

    @GetMapping("/prueba-juego")
    public String obtenerJuegos(){
        return "Respuesta del Servicio de Inventario";
    }

    @GetMapping("/juego-pedido")
    public String obtenerJuegoPedido(){
        return servicePedidoClient.obtenerPedidos();
    }

}
