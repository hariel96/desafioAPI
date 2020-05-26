package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.Ingresso;

public interface IngressoRepo extends JpaRepository<Ingresso, Integer>{

}
