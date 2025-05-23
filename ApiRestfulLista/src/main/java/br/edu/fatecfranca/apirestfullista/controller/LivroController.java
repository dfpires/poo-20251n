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
    @DeleteMapping("/{id}")
    public String deleteLivro(@PathVariable Long id){
        // vetor tem um método chamado removeIf
        // que remove caso o livro seja encontrado
        // removeIf percorre o vetor - livro representa cada livro no vetor
        boolean resp = this.livros.removeIf(livro -> livro.getId() == id);
        if(resp){
            return "Livro removido com sucesso!";
        }
        else {
            return "Livro nao encontrado";
        }
    }
    @PutMapping("/{id}")
    public Livro updateLivro(@PathVariable Long id, @RequestBody Livro novo){
        // percorre o vetor
        for(Livro livro : this.livros){
            // se o id do livro no vetor = id do frontend
            if(livro.getId() == id){
                livro.setTitulo(novo.getTitulo());
                livro.setAutor(novo.getAutor());
                livro.setEditora(novo.getEditora());
                return livro; // retorna livro atualizado
            }
        }
        return null;
    }

}
