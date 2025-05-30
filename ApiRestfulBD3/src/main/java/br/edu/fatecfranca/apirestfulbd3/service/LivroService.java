package br.edu.fatecfranca.apirestfulbd3.service;

import br.edu.fatecfranca.apirestfulbd3.model.Livro;
import br.edu.fatecfranca.apirestfulbd3.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    // injeção de dependência -> serve para se utilizar um objeto
    // sem precisar instanciá-lo
    LivroRepository livroRepository;
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }
    public List<Livro> getLivros(){
        return livroRepository.findAll(); // select * from livro
    }
    public Livro addLivro(Livro livro){
        return livroRepository.save(livro); // insert into livro
    }
    public String removeLivro(Long id){
        if (livroRepository.existsById(id)){
            livroRepository.deleteById(id);
            return "Livro removido com sucesso!";
        }
        return  "Livro não encontrado";
    }
}
