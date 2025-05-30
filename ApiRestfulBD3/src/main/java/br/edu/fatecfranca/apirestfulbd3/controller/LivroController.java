package br.edu.fatecfranca.apirestfulbd3.controller;

import br.edu.fatecfranca.apirestfulbd3.model.Livro;
import br.edu.fatecfranca.apirestfulbd3.service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livro")
public class LivroController {
    // injeção de dependência
    LivroService livroService;
    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }
    @GetMapping
    public List<Livro> getLivros(){
        return livroService.getLivros();
    }
    @PostMapping
    public Livro addLivro(@RequestBody Livro livro){
        return livroService.addLivro(livro);
    }
    @DeleteMapping("/{id}")
    public String removeLivro(@PathVariable Long id){
        return livroService.removeLivro(id);
    }
}
