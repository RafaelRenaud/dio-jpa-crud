package com.dio.crud.app.service;

import com.dio.crud.app.model.dto.MatriculaDTO;
import com.dio.crud.app.model.entity.Matricula;

import java.util.List;

public interface MatriculaService {
    Matricula create(MatriculaDTO matricula);

    Matricula get(Long id);

    List<Matricula> getAll();

    Matricula update(Long id, MatriculaDTO aluno);

    void delete(Long id);
}
