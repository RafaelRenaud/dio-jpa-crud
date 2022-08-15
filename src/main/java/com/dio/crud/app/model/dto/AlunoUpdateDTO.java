package com.dio.crud.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class AlunoUpdateDTO {

    private String nome;

    private String bairro;

    private LocalDateTime dataDeNascimento;
}
