package com.gcc.invgas.dto;

import java.util.List;

public record EntregasReporte(List<Investigador> investigadores, List<Entrega> entregas) {
    public record Investigador(String id, String nombre, String dni, String renacyt, String nivelRenacyt) {}

    public record Entrega(String idTarea, String idInvestigador, String estado) {}
}
