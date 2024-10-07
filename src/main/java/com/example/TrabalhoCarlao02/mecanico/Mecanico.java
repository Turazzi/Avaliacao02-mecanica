package com.example.TrabalhoCarlao02.mecanico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mecanico {

    private String mecanico;
    private int experiencia;

    public Mecanico(DadosCadastroMecanico dados) {
        this.mecanico = dados.mecanico();
        this.experiencia = dados.experiencia();
    }
}