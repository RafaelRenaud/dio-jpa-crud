package com.dio.crud.app.controller;

import com.dio.crud.app.model.dto.AvaliacaoFisicaDTO;
import com.dio.crud.app.model.entity.AvaliacaoFisica;
import com.dio.crud.app.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaServiceImpl avaliacaoFisicaService;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisica){
        return avaliacaoFisicaService.create(avaliacaoFisica);
    }
}
