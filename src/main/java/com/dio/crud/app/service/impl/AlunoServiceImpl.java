package com.dio.crud.app.service.impl;

import com.dio.crud.app.model.dto.AlunoDTO;
import com.dio.crud.app.model.dto.AlunoUpdateDTO;
import com.dio.crud.app.model.entity.Aluno;
import com.dio.crud.app.model.entity.AvaliacaoFisica;
import com.dio.crud.app.repository.AlunoRepository;
import com.dio.crud.app.repository.AvaliacaoFisicaRepository;
import com.dio.crud.app.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Aluno create(AlunoDTO alunoDTO) {

        Aluno aluno = new Aluno();
        aluno.setNome(alunoDTO.getNome());
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setBairro(alunoDTO.getBairro());
        aluno.setDataDeNascimento(alunoDTO.getDataDeNascimento());

        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        List<Aluno> alunos = alunoRepository.findAll();
        return alunos;
    }

    @Override
    public Aluno update(Long id, AlunoUpdateDTO aluno) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAvaliacoesFisicas(Long id){
        Aluno aluno = alunoRepository.findById(id).get();
        return aluno.getAvaliacoes();
    }

    @Override
    public void delete(Long id) {

    }
}
