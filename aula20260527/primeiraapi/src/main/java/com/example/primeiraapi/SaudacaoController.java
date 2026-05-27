package com.example.primeiraapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaudacaoController{
    @GetMapping("/saudacoes")
    public String saudacao(@RequestParam(defaultValue = "Visitante")String nome){
        return "Olá, "+nome+"! Seja bem-vindo ao spring boot.";
    }
}
