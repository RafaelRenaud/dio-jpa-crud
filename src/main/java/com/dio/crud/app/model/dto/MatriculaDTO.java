package com.dio.crud.app.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Getter
@Setter
@AllArgsConstructor
public class MatriculaDTO {

    @NotNull(message = "Preencha o campo corretamente")
    @Positive(message = "Matrícula Incorreta")
    private Long alunoId;
}
