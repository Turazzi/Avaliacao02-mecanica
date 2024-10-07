package com.example.TrabalhoCarlao02.conserto;

import com.example.TrabalhoCarlao02.mecanico.Mecanico;
import com.example.TrabalhoCarlao02.veiculo.Veiculo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "consertos")
@Entity(name = "conserto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Conserto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entrada;
    private String saida;

    @Embedded
    private Mecanico mecanico;
    @Embedded
    private Veiculo veiculo;

    public Conserto(DadosCadastroConserto dados) {
        this.entrada = dados.entrada();
        this.saida = dados.saida();
        this.mecanico = new Mecanico(dados.mecanico());
        this.veiculo = new Veiculo(dados.veiculo());
    }
}
