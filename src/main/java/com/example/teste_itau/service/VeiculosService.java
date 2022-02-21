package com.example.teste_itau.service;

import com.example.teste_itau.model.Veiculos;
import com.example.teste_itau.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class VeiculosService {

    @Autowired
    VeiculosRepository repository;


    public void insert( Veiculos veiculo){
        repository.save(veiculo);

    }


    public Veiculos get(Long id){
        return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void update(Veiculos veiculo){
        repository.save(veiculo);
    }
}
