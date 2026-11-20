package com.gcc.invgas.dto;

import java.util.List;
import lombok.Data;

@Data
public class EntregasReporte {
    private List<Investigador> investigadores;
    private List<Entrega> entregas;

    @Data
    public static class Investigador {
        private String id;
        private String nombre;
        private String dni;
        private String renacyt;
        private String nivelRenacyt;
    }

    @Data
    public static class Entrega {
        private String idTarea;
        private String idInvestigador;
        private String estado;
    }
}
