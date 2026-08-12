package com.example.react_e_spring.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController


@RequestMapping("api/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();


    public AlunoController(){
        alunos.add(new Aluno(1l, "Ana Silva", "Técnico em Informática"));
        alunos.add(new Aluno(2l, "Paulo rodrigues", "Técnico em Mecânica"));
        alunos.add(new Aluno(3l, "Ana Carla", "Técnico em Eletrônica"));
    }

    @GetMapping
    public List<Aluno> listartodos(){return alunos}
}
