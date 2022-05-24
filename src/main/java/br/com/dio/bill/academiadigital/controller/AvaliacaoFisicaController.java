package br.com.dio.bill.academiadigital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dio.bill.academiadigital.entity.AvaliacaoFisica;
import br.com.dio.bill.academiadigital.entity.form.AvaliacaoFisicaForm;
import br.com.dio.bill.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

	@Autowired
	private AvaliacaoFisicaServiceImpl service;
	
	@PostMapping
	public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
		return service.create(form);
	}
}
