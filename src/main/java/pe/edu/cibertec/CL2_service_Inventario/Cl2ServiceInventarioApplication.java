package pe.edu.cibertec.CL2_service_Inventario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Cl2ServiceInventarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(Cl2ServiceInventarioApplication.class, args);
	}

}
