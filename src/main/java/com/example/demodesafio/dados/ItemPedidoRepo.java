package com.example.demodesafio.dados;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demodesafio.model.ItemPedido;

public interface ItemPedidoRepo extends JpaRepository<ItemPedido, Integer>{
	
	

}
