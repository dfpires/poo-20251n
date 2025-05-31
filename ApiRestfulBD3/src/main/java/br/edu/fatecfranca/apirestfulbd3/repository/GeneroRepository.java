package br.edu.fatecfranca.apirestfulbd3.repository;

import br.edu.fatecfranca.apirestfulbd3.model.Genero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends
        JpaRepository<Genero, Long> {
}
