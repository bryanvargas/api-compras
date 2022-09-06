package com.belerofonte.springboot.microservice.compra.controller;

import com.belerofonte.springboot.microservice.compra.model.Compra;
import com.belerofonte.springboot.microservice.compra.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/compra")
public class CompraController {
    @Autowired
    private CompraService compraService;

    @PostMapping
    public ResponseEntity<?> saveCompra(@RequestBody Compra compra) {
        return new ResponseEntity<>(compraService.saveCompra(compra), HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public ResponseEntity<?> getAllComprasOfUser(@PathVariable Long userId) {
        return ResponseEntity.ok(compraService.findAllComprasOfUser(userId));
    }
}
