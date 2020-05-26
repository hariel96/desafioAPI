package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.Evento;

public interface EventoRepo extends JpaRepository<Evento, Integer>{

}
