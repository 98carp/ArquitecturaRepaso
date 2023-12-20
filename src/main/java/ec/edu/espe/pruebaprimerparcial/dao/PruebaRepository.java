package ec.edu.espe.pruebaprimerparcial.dao;

import ec.edu.espe.pruebaprimerparcial.domain.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface PruebaRepository extends JpaRepository<Prueba, Integer> {

}
