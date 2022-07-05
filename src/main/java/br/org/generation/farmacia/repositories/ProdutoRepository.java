package br.org.generation.farmacia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.farmacia.models.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long> {
	
	Object findAllByNomeContainingIgnoreCase(String nome);

}
