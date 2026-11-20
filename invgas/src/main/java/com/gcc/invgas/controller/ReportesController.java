package com.gcc.invgas.controller;

import com.gcc.invgas.service.ReportesService;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/reportes", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReportesController {

    private final ReportesService reportesService;

    public ReportesController(ReportesService reportesService) {
        this.reportesService = reportesService;
    }

    @GetMapping("/catalogos")
    public Resource catalogos() {
        return reportesService.obtenerCatalogos();
    }

    @GetMapping("/entregas")
    public Resource entregas() {
        return reportesService.obtenerEntregas();
    }

    @GetMapping("/produccion")
    public Resource produccion() {
        return reportesService.obtenerProduccion();
    }
}
