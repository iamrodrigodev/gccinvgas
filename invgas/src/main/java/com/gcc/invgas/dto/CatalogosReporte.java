package com.gcc.invgas.dto;

import java.util.List;
import lombok.Data;
import tools.jackson.databind.node.ObjectNode;

@Data
public class CatalogosReporte {
    private ObjectNode catalogos;
    private List<Clase> clases;
    private List<Tarea> tareas;

    @Data
    public static class Clase {
        private String id;
        private String nombre;
    }

    @Data
    public static class Tarea {
        private String id;
        private String idClase;
        private String titulo;
        private String fecha;
    }
}
