package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.Papel;

public interface PapelRepo extends JpaRepository<Papel, Integer> {

}
