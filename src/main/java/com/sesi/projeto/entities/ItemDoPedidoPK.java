package com.sesi.projeto.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tem_do_pedido")
public class ItemDoPedidoPK {
	
	@EmbeddedId
	private ItemDoPedidoPK id = new ItemDoPedidoPK();
	
	private Integer quantidade;
	private Double preco;
	
	public ItemDoPedidoPK() {
		
	}

	public ItemDoPedidoPK getId() {
		return id;
	}

	public void setId(ItemDoPedidoPK id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
