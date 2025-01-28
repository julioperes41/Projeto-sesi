package com.sesi.projeto.entities;


import com.sesi.projeto.dto.ProdutoDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	
	@Entity
	@Table(name = "tb_produto")
	public class Produto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private Double preco;
	private String descricao;
	
	public Produto() {
		
	}
	
	public Produto(ProdutoDTO d) {
		this.nome = d.descricao();
		this.preco = d.preco();
		this.descricao = d.descricao();
	}
	
	
	public Produto(long id, String nome, Double preco, String descricao) {
		
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}




	public long getId() {
		
		
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}



