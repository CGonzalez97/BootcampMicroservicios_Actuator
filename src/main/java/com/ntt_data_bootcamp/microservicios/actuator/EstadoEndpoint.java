package com.ntt_data_bootcamp.microservicios.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="pruebas2")
public class EstadoEndpoint {
	
	@ReadOperation
	public String probar() {
		return "Funciona";
	}
	

}
