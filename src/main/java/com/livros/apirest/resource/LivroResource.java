package com.livros.apirest.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livros.apirest.repository.LivroRepository;

@RestController
@RequestMapping(value="/api")
public class LivroResource {
	
	@Autowired
	LivroRepository livroRepository;
	
	@GetMapping("/livros")
	

}
