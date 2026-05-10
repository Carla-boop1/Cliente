package cl.proyecto.Cliente.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.proyecto.Cliente.model.cliente;

public interface ClienteRepository extends JpaRepository<cliente, Long> {
    Optional<cliente> findByNombre(String nombre);
}
