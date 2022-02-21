package com.example.teste_itau.controller;

import com.example.teste_itau.model.Veiculos;
import com.example.teste_itau.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculosService service;

    @GetMapping("/{id}")
    public Veiculos getVeiculo(@PathVariable Long id){
        return service.get(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Veiculos veiculo){
        service.insert(veiculo);
    }


    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@RequestBody Veiculos veiculo){
        service.update(veiculo);
    }
}
