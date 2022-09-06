package com.belerofonte.springboot.microservice.compra.service;

import com.belerofonte.springboot.microservice.compra.model.Compra;

import java.util.List;

public interface CompraService {
    Compra saveCompra(Compra compra);

    List<Compra> findAllComprasOfUser(Long userId);
}
