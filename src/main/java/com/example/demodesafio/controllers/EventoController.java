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

import com.example.demodesafio.dados.EventoRepo;
import com.example.demodesafio.model.CasaDeShow;
import com.example.demodesafio.model.Evento;

@RestController
@RequestMapping("/api")
public class EventoController {
	
	@Autowired
	private EventoRepo repo;
	
	@GetMapping("/evento")
	public List<Evento> getEventos() {
		return repo.findAll();
	}
	
	@PostMapping("/evento")
	public void criarEvento(@RequestBody Evento evento) {
		repo.save(evento);
	}
	
	@PutMapping("/evento")
	public void alteraEvento(@RequestBody Evento evento) {
		repo.save(evento);
	}
	
	@DeleteMapping("/evento/{id}")
	public List<Evento> deleteEvento(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
}
