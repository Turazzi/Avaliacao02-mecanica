package com.example.TrabalhoCarlao02.controller;


import com.example.TrabalhoCarlao02.conserto.Conserto;
import com.example.TrabalhoCarlao02.conserto.DadosCadastroConserto;
import com.example.TrabalhoCarlao02.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repo;

    @PostMapping
    @Transactional
    public void cadastrarConserto(@RequestBody DadosCadastroConserto dados) {
        repo.save(new Conserto(dados));
    }
}
