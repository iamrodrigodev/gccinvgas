package com.gcc.invgas.service;

import com.gcc.invgas.dto.CatalogosReporte;
import com.gcc.invgas.dto.EntregasReporte;
import com.gcc.invgas.dto.ProduccionReporte;
import java.io.IOException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import tools.jackson.databind.json.JsonMapper;

@Service
public class ReportesService {

    private final CatalogosReporte catalogos;
    private final EntregasReporte entregas;
    private final ProduccionReporte produccion;

    public ReportesService(JsonMapper mapper) throws IOException {
        catalogos = leer(mapper, "reportes/catalogos.json", CatalogosReporte.class);
        entregas = leer(mapper, "reportes/entregas.json", EntregasReporte.class);
        produccion = leer(mapper, "reportes/produccion.json", ProduccionReporte.class);
    }

    public CatalogosReporte obtenerCatalogos() {
        return catalogos;
    }

    public EntregasReporte obtenerEntregas() {
        return entregas;
    }

    public ProduccionReporte obtenerProduccion() {
        return produccion;
    }

    private static <T> T leer(JsonMapper mapper, String ruta, Class<T> tipo) throws IOException {
        try (var contenido = new ClassPathResource(ruta).getInputStream()) {
            return mapper.readValue(contenido, tipo);
        }
    }
}
