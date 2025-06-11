package br.edu.fatecfranca.apirestfulbd3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    // Um gênero tem muitos livros
    @OneToMany(mappedBy="genero")
    @JsonIgnore // faz com que não exista uma recursividade no JSON com o livro
    private List<Livro> livros; // guarda os livros do gênero

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
