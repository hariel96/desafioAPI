package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.Cliente;

public interface ClienteRepo extends JpaRepository<Cliente, Integer> {

}
