package br.edu.fatecfranca.apirestfulbd3.repository;
import br.edu.fatecfranca.apirestfulbd3.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
// uma interface é uma classe especial, onde todos os métodos
// são abstratos, ou seja, não são implementados

// uma interface pode herdar de outra interface, neste caso,
// vai herdar de JpaRepository, que precisamos indicar qual
// classe que será utilizada pelos métodos de CRUD

public interface LivroRepository extends
        JpaRepository<Livro, Long> {
    // a interface LivroRepository vai conter os métodos
    // de CRUD vinculados ao Livro, exemplos:
    // findAll, save, findById, etc
}
