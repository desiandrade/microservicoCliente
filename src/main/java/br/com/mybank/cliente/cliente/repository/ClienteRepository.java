package br.com.mybank.cliente.cliente.repository;

import br.com.mybank.cliente.cliente.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

    public Optional<Pessoa> findByIdUsuario(Integer id);

}
