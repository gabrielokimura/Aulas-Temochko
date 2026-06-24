package com.example.api_catalogoProdutos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_catalogoProdutos.dtos.ProdutoRequestDTO;
import com.example.api_catalogoProdutos.dtos.ProdutoResponseDTO;
import com.example.api_catalogoProdutos.models.Produto;
import com.example.api_catalogoProdutos.repositories.ProdutoRepository;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<ProdutoResponseDTO> listarTodos() {
        return repository.findAll().stream()
                .map(p -> new ProdutoResponseDTO(p.getId(), p.getNome(), p.getPreco()))
                .toList();
    }

    public ProdutoResponseDTO buscarPorId(Long id){
        Produto produto = repository.findById(id).orElseThrow(() -> new RuntimeException("Jogo não encontado"));
        return  new ProdutoResponseDTO(produto.getId(), produto.getNome(), produto.getPreco());
    }


    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        Produto produtoExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Jogo não encontrado!"));

        produtoExistente.setNome(dto.nome());
        produtoExistente.setPreco(dto.preco());

        Produto produtoatualizado = repository.save(produtoExistente);

        return new ProdutoResponseDTO(produtoatualizado.getId(), produtoatualizado.getNome(), produtoatualizado.getPreco());

    }

    public ProdutoResponseDTO salvar(ProdutoRequestDTO data) {
        Produto novoProduto = new Produto(null, data.nome(), data.preco());
        Produto salvo = repository.save(novoProduto);
        return new ProdutoResponseDTO(salvo.getId(), salvo.getNome(), salvo.getPreco());
    }

    public void deletar (Long id){
        if (!repository.existsById(id)){
            throw  new RuntimeException("Jogo não emcontrado!");
        }
        repository.deleteById(id);
    }


}

