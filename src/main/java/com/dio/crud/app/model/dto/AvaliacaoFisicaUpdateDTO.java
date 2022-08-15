package com.dio.crud.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AvaliacaoFisicaUpdateDTO {
    private double peso;

    private double altura;
}
