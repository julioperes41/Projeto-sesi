package com.sesi.projeto.entities;

import java.time.Instant;

public record PedidoDTO(Instant momento, StatusDoPedido status) {

}
