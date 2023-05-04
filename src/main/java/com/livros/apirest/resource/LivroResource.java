package com.livros.apirest.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livros.apirest.models.Livro;
import com.livros.apirest.repository.LivroRepository;

@RestController
@RequestMapping(value="/api")
public class LivroResource {
	
	@Autowired
	LivroRepository livroRepository;
	
	@GetMapping("/livros")
	public List<Livro> listaLivros(){
		return livroRepository.findAll();
		
		
		@GetMapping("/livro/{id}")
		public Livro listaLivroUnico(@PathVariable(value="id") long id){
			return livroRepository.findAll();	
	}

}
