package com.sesi.projeto.entities;

import java.time.Instant;

import com.sesi.projeto.dto.PedidoDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido { 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private Instant momento ;
	private StatusDoPedido status ;	
	
	@ManyToOne
	@JoinColumn(name = "cliente_Id")
	private Usuario cliente;
	
	@OneToOne(mappedBy = "pedido", cascade = CascadeType.ALL)
	private Pagamento pagamento;





public Pedido(long id, Instant momento, StatusDoPedido status) {
	super();
	this.id = id;
	this.momento = momento;
	this.status = status;
	
}
	
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
