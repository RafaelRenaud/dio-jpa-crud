package com.dio.crud.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AvaliacaoFisicaDTO {
    private Long alunoId;

    private double peso;

    private double altura;
}
