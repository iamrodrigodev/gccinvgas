package com.gcc.invgas.controller;

import com.gcc.invgas.dto.CatalogosReporte;
import com.gcc.invgas.dto.EntregasReporte;
import com.gcc.invgas.dto.ProduccionReporte;
import com.gcc.invgas.service.ReportesService;
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
    public CatalogosReporte catalogos() {
        return reportesService.obtenerCatalogos();
    }

    @GetMapping("/entregas")
    public EntregasReporte entregas() {
        return reportesService.obtenerEntregas();
    }

    @GetMapping("/produccion")
    public ProduccionReporte produccion() {
        return reportesService.obtenerProduccion();
    }
}
