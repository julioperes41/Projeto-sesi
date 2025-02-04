package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")
public class ItemDoPedido {
	
	
	@EmbeddedId	
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	@ManyToOne
	@JoinColumn(name = "tb_pedido_item")
	private Pedido pedido;

	
	private Integer quantidade;
	private Double preco;
	public ItemDoPedido() {}
	
	
	
	public ItemDoPedido(Integer quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
			
		
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	}


