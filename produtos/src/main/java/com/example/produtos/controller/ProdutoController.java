package com.example.produtos.controller;

import com.example.produtos.model.Produto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    @PostMapping
    public Produto cadastrar(@RequestBody Produto produto) {
        produtos.add(produto);
        return produto;
    }

    @GetMapping
    public List<Produto> listar() {
        return produtos;
    }
}
