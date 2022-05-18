package com.jvoq.microservicios.gateway.app;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {
  
  @GetMapping("/fallback")
  public String mensaje() {
    return "Servicio alternativo, espere un momento";
  }

}
