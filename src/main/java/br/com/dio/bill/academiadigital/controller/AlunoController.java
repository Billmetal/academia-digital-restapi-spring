package br.com.dio.bill.academiadigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.bill.academiadigital.entity.Aluno;
import br.com.dio.bill.academiadigital.entity.AvaliacaoFisica;
import br.com.dio.bill.academiadigital.entity.form.AlunoForm;
import br.com.dio.bill.academiadigital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

	@Autowired
	private AlunoServiceImpl service;
	
	@GetMapping
	public List<Aluno> getAll(){
		return service.getAll();
	}
	
	@PostMapping
	public Aluno create(@RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaId(id);
	}
}
