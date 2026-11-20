package com.gcc.invgas.dto;

import java.util.List;
import lombok.Data;
import tools.jackson.databind.node.ObjectNode;

@Data
public class ProduccionReporte {
    private List<ObjectNode> registros;
}
