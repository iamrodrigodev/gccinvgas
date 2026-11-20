package com.gcc.invgas.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

@Service
public class ReportesService {

    public Resource obtenerCatalogos() {
        return new ClassPathResource("reportes/catalogos.json");
    }

    public Resource obtenerEntregas() {
        return new ClassPathResource("reportes/entregas.json");
    }

    public Resource obtenerProduccion() {
        return new ClassPathResource("reportes/produccion.json");
    }
}
