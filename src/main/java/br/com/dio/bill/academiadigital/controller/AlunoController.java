package br.com.dio.bill.academiadigital.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/niver")
	public List<Aluno> getAllByDataDeNascimento(@RequestParam(value = "dataDeNascimento",required = false) String dataDeNascimento){
		return service.getAllByDataDeNascimento(dataDeNascimento);
	}
	
	@PostMapping
	public Aluno create(@Valid @RequestBody AlunoForm form) {
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
		return service.getAllAvaliacaoFisicaId(id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
