package com.example.primeiraapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController{
    @GetMapping("/produto")
    public Produto Produto(){
        return new Produto(1L,"Notebook",3500.00);
    }
    @GetMapping("/produtos")
public List<Produto> listarProdutos(){
        return List.of(
                new Produto(1L, "Notebook", 3500.00),
                new Produto(2L, "Mouse", 80.00),
                new Produto(3L, "Teclado", 150.00)
        );
    }
}

