package com.gcc.invgas.dto;

import java.util.List;
import tools.jackson.databind.node.ObjectNode;

public record CatalogosReporte(ObjectNode catalogos, List<Clase> clases, List<Tarea> tareas) {
    public record Clase(String id, String nombre) {}

    public record Tarea(String id, String idClase, String titulo, String fecha) {}
}
