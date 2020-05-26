package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.Pedido;

public interface PedidoRepo extends JpaRepository<Pedido, Integer>{

}
