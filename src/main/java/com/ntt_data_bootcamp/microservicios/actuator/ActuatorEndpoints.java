package com.ntt_data_bootcamp.microservicios.actuator;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "personals")
public class ActuatorEndpoints {
	
	@GetMapping("/prueba")
	public ResponseEntity<String> showText() {
		return ResponseEntity.status(HttpStatus.OK).body("Endo point de prueba");
	}
	
}
