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

import com.example.demodesafio.dados.CasaDeShowRepo;
import com.example.demodesafio.model.CasaDeShow;
import com.example.demodesafio.model.Cliente;

@RestController
@RequestMapping("/api")
public class CasaDeShowController {

	@Autowired
	private CasaDeShowRepo repo;

	@GetMapping("/casadeshow")
	public List<CasaDeShow> getCasasDeShow() {
		return repo.findAll();
	}

	@PostMapping("/casadeshow")
	public void criarCasaDeShow(@RequestBody CasaDeShow casaDeShow) {
		repo.save(casaDeShow);
	}
	
	@PutMapping("/casadeshow")
	public void alteraCasaDeShow(@RequestBody CasaDeShow casaDeShow) {
		repo.save(casaDeShow);
	}
	
	@DeleteMapping("/casadeshow/{id}")
	public List<CasaDeShow> deleteCasaDeShow(@PathVariable(name = "id") Integer id) {
		repo.deleteById(id);
		return repo.findAll();
	}
}
