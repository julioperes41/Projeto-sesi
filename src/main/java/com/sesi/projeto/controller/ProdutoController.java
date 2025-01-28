package com.sesi.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesi.projeto.dto.ProdutoDTO;
import com.sesi.projeto.entities.Produto;
import com.sesi.projeto.repositories.ProdutoRepositories;

@RestController
@RequestMapping("produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepositories repo;
	
	@GetMapping
	public ResponseEntity<?> mostrarTodos(){
		List<Produto> prod = repo.findAll();
		return ResponseEntity.ok(prod);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?>  mostrarPorId(@PathVariable long id){
		Produto prod = repo.getById(id);
		return ResponseEntity.ok(prod);
	}
	
	@PostMapping
	public ResponseEntity<Produto> criar(@RequestBody ProdutoDTO dto){
		produto prod = new Produto(dto);
		return ResponseEntity.ok(prod); 
	}

}
