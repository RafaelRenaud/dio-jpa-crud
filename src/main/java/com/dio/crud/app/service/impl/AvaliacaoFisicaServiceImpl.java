package com.dio.crud.app.service.impl;

import com.dio.crud.app.model.dto.AvaliacaoFisicaDTO;
import com.dio.crud.app.model.dto.AvaliacaoFisicaUpdateDTO;
import com.dio.crud.app.model.entity.Aluno;
import com.dio.crud.app.model.entity.AvaliacaoFisica;
import com.dio.crud.app.repository.AlunoRepository;
import com.dio.crud.app.repository.AvaliacaoFisicaRepository;
import com.dio.crud.app.service.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements AvaliacaoFisicaService {
    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisicaDTO) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(avaliacaoFisicaDTO.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(avaliacaoFisicaDTO.getPeso());
        avaliacaoFisica.setAltura(avaliacaoFisicaDTO.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO aluno) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
