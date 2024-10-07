package com.example.TrabalhoCarlao02.conserto;

import com.example.TrabalhoCarlao02.mecanico.DadosCadastroMecanico;
import com.example.TrabalhoCarlao02.veiculo.DadosCadastroVeiculo;

public record DadosCadastroConserto(String entrada, String saida,
                                    DadosCadastroMecanico mecanico, DadosCadastroVeiculo veiculo) {
}
