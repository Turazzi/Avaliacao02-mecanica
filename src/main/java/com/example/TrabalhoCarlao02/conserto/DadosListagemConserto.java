package com.example.TrabalhoCarlao02.conserto;

import com.example.TrabalhoCarlao02.mecanico.DadosCadastroMecanico;
import com.example.TrabalhoCarlao02.veiculo.DadosCadastroVeiculo;
import com.example.TrabalhoCarlao02.conserto.Conserto;

public record DadosListagemConserto(
        String entrada,
        String saida,
        String mecanico,
        String veiculo_marca,
        String veiculo_modelo

) {
    public DadosListagemConserto(Conserto conserto) {
        this(conserto.getEntrada(), conserto.getSaida(), conserto.getMecanico().getMecanico(),
                conserto.getVeiculo().getMarca(), conserto.getVeiculo().getModelo());
    }
}
