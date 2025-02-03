package com.sesi.projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class ItemDoPedido {
	
	public integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(integer quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public ItemDoPedido(integer quantidade, double preco) {
		super();
		this.quantidade = quantidade;
		this.preco = preco;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private integer quantidade;
	private double preco;

}
