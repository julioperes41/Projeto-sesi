package com.sesi.projeto.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Pedido { 
	

    public Pedido(long id, Instant momento, StatusDoPedido status) {
		super();
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private Instant momento ;
	private StatusDoPedido status ;
	
	public Pedido() { 
	}
	
	public Pedido(PedidoDTO d) {
		this.momento = d.momento();
		this.status = d.status();
	}
	

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Instant getMomento() {
		return momento;
	}

	public void setMomento(Instant momento) {
		this.momento = momento;
	}

	public StatusDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatusDoPedido status) {
		this.status = status;
	}
}