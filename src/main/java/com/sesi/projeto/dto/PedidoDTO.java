package com.sesi.projeto.dto;

import java.time.Instant;

import com.sesi.projeto.entities.StatusDoPedido;

public record PedidoDTO(Instant momento, StatusDoPedido status) {

}
