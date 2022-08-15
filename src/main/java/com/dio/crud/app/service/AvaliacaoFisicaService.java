package com.dio.crud.app.service;

import com.dio.crud.app.model.dto.AvaliacaoFisicaDTO;
import com.dio.crud.app.model.dto.AvaliacaoFisicaUpdateDTO;
import com.dio.crud.app.model.entity.AvaliacaoFisica;

import java.util.List;

public interface AvaliacaoFisicaService {
    AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisica);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO aluno);

    void delete(Long id);
}
