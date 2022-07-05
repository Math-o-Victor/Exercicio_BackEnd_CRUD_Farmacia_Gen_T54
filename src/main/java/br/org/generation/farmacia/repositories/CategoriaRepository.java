package br.org.generation.farmacia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.farmacia.models.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long> {

	Object findAllByCategContainingIgnoreCase(String categ);
}
