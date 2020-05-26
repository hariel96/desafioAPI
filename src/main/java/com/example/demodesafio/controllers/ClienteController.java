package com.example.demodesafio.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demodesafio.dados.ClienteRepo;
import com.example.demodesafio.model.Cliente;
import com.example.demodesafio.model.Ingresso;

@RestController
@RequestMapping("/api")
public class ClienteController {
	
	@Autowired
	private ClienteRepo repo;
	
	@GetMapping("/cliente")
	public List<Cliente> getClientes() {
		return repo.findAll();
		}
	
	@PostMapping("/cliente")
	public void criarCliente(@RequestBody Cliente cliente) {
		repo.save(cliente);
	}
	
	@PutMapping("/cliente")
	public void alteraCliente(@RequestBody Cliente cliente) {
		repo.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public List<Cliente> deleteCliente(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}

}
