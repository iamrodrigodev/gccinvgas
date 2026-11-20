package com.gcc.invgas.dto;

import java.util.List;
import tools.jackson.databind.node.ObjectNode;

public record ProduccionReporte(List<ObjectNode> registros) {}
