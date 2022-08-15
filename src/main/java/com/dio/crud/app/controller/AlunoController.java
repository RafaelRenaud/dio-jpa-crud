package com.dio.crud.app.controller;

import com.dio.crud.app.model.dto.AlunoDTO;
import com.dio.crud.app.model.entity.Aluno;
import com.dio.crud.app.model.entity.AvaliacaoFisica;
import com.dio.crud.app.service.impl.AlunoServiceImpl;
import com.dio.crud.app.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    @Autowired
    private AlunoServiceImpl alunoService;

    @GetMapping
    public List<Aluno> getAll(){
        return alunoService.getAll();
    }

    @PostMapping
    public Aluno create(@Valid @RequestBody AlunoDTO aluno){
        return alunoService.create(aluno);
    }

    @GetMapping("/avaliacoes/{aluno_id}")
    public List<AvaliacaoFisica> getAvaliacoesFisicas(@PathVariable Long aluno_id){
        return alunoService.getAvaliacoesFisicas(aluno_id);
    }
}
