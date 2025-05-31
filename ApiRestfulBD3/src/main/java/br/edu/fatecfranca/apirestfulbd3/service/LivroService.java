package br.edu.fatecfranca.apirestfulbd3.service;

import br.edu.fatecfranca.apirestfulbd3.model.Genero;
import br.edu.fatecfranca.apirestfulbd3.model.Livro;
import br.edu.fatecfranca.apirestfulbd3.repository.GeneroRepository;
import br.edu.fatecfranca.apirestfulbd3.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    // injeção de dependência -> serve para se utilizar um objeto
    // sem precisar instanciá-lo
    LivroRepository livroRepository;
    GeneroRepository generoRepository;
    public LivroService(LivroRepository livroRepository, GeneroRepository generoRepository) {
        this.livroRepository = livroRepository;
        this.generoRepository = generoRepository;
    }
    public List<Livro> getLivros(){
        return livroRepository.findAll(); // select * from livro
    }
    public Livro addLivro(Livro livro){
        Genero aux = generoRepository.findById(livro.getGenero().getId()).orElse(null);
        if (aux != null){ // achei
            livro.setGenero(aux);
            return livroRepository.save(livro);
        }
        return null; // insert into livro
    }
    public String removeLivro(Long id){
        if (livroRepository.existsById(id)){
            livroRepository.deleteById(id);
            return "Livro removido com sucesso!";
        }
        return  "Livro não encontrado";
    }
    public Livro updateLivro(Long id, Livro novo){
        // verifica se o livro existe, se existe, retorna o livro, senão, null
        Livro recuperado = livroRepository.findById(id).orElse(null);
        if (recuperado != null){ // livro encontrado
            recuperado.setTitulo(novo.getTitulo());
            recuperado.setAutor(novo.getAutor());
            recuperado.setEditora(novo.getEditora());
            livroRepository.save(recuperado); // recuperado tem id, portanto, atualiza
            return recuperado;
        }
        return null; // não encontrou o livro
    }
}
