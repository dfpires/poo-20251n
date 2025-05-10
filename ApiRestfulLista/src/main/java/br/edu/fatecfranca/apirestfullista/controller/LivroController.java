package br.edu.fatecfranca.apirestfullista.controller;

import br.edu.fatecfranca.apirestfullista.model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // indica que a classe recebe e responde requisição REST
@RequestMapping("/livro") // recebe e responde o endpoint /livro
public class LivroController {
    // endpoint http://localhost:8080/livro

    // banco de dados em memória - List
    List<Livro> livros = new ArrayList<>();

    @GetMapping // método responde requisição GET
    public List<Livro> getLivros(){
        return this.livros; // retorna o vetor com os livros
    }
    @PostMapping // método responde requisição POST
    public Livro addLivro(@RequestBody Livro livro){
        this.livros.add(livro); // adiciona livro no vetor
        return livro;
    }
}
