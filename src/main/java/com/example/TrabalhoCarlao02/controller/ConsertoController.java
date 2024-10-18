package com.example.TrabalhoCarlao02.controller;


import com.example.TrabalhoCarlao02.conserto.Conserto;
import com.example.TrabalhoCarlao02.conserto.DadosCadastroConserto;
import com.example.TrabalhoCarlao02.conserto.DadosListagemConserto;
import com.example.TrabalhoCarlao02.repository.ConsertoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("consertos")
public class ConsertoController {

    @Autowired
    private ConsertoRepository repo;

    @PostMapping
    @Transactional
    public void cadastrarConserto(@RequestBody @Valid DadosCadastroConserto dados) {
        repo.save(new Conserto(dados));
    }

    @GetMapping
    public Page<Conserto> listar(Pageable paginacao) {
        return repo.findAll(paginacao);
    }

    @GetMapping("dadosespecificios")
    public List<DadosListagemConserto> listarDadosEspecificios() {
        return repo.findAll().stream().map(DadosListagemConserto::new).toList();
    }
}
