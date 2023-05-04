package com.livros.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.apirest.models.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{
	
	Livro findById(long id);

}
