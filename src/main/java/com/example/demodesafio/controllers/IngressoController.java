package com.example.demodesafio.controllers;

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

import com.example.demodesafio.dados.IngressoRepo;
import com.example.demodesafio.model.CasaDeShow;
import com.example.demodesafio.model.Evento;
import com.example.demodesafio.model.Ingresso;

@RestController
@RequestMapping("/api")
public class IngressoController {

	@Autowired
	private IngressoRepo repo;

	@GetMapping("/ingresso")
	public List<Ingresso> getIngressos() {
		return repo.findAll();
	}

	@PostMapping("/ingresso")
	public void criarIngresso(@RequestBody Ingresso ingresso) {
		repo.save(ingresso);
	}
	
	@PutMapping("/ingresso")
	public void alteraIngresso(@RequestBody Ingresso ingresso) {
		repo.save(ingresso);
	}
	
	@DeleteMapping("/ingresso/{id}")
	public List<Ingresso> deleteIngresso(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
	
	

}
