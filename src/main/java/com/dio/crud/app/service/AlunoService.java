package com.dio.crud.app.service;

import com.dio.crud.app.model.dto.AlunoDTO;
import com.dio.crud.app.model.dto.AlunoUpdateDTO;
import com.dio.crud.app.model.entity.Aluno;
import com.dio.crud.app.model.entity.AvaliacaoFisica;

import java.util.List;

public interface AlunoService {
    Aluno create(AlunoDTO aluno);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateDTO aluno);

    List<AvaliacaoFisica> getAvaliacoesFisicas(Long id);

    void delete(Long id);
}
