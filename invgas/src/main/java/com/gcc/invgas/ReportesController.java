package com.gcc.invgas;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/reportes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReportesController {

    @GetMapping("/catalogos")
    public Resource catalogos() {
        return new ClassPathResource("reportes/catalogos.json");
    }

    @GetMapping("/entregas")
    public Resource entregas() {
        return new ClassPathResource("reportes/entregas.json");
    }

    @GetMapping("/produccion")
    public Resource produccion() {
        return new ClassPathResource("reportes/produccion.json");
    }
}
