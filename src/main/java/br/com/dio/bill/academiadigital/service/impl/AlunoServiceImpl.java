package br.com.dio.bill.academiadigital.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.bill.academiadigital.entity.Aluno;
import br.com.dio.bill.academiadigital.entity.AvaliacaoFisica;
import br.com.dio.bill.academiadigital.entity.form.AlunoForm;
import br.com.dio.bill.academiadigital.entity.form.AlunoUpdateForm;
import br.com.dio.bill.academiadigital.infra.utils.JavaTimeUtils;
import br.com.dio.bill.academiadigital.repository.AlunoRepository;
import br.com.dio.bill.academiadigital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{
	
	@Autowired
	private AlunoRepository repository;

	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setBairro(form.getBairro());
		aluno.setCpf(form.getCpf());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		return repository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno;
	}

	
	
	@Override
	public List<Aluno> getAll() {
		return repository.findAll();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}

	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {
		Aluno aluno = repository.findById(id).get();
		return aluno.getAvaliacoes();
	}

	@Override
	public List<Aluno> getAllByDataDeNascimento(String dataDeNascimento) {
		if(dataDeNascimento == null) {
			return repository.findAll();
		} else {
			LocalDate localDate = LocalDate.parse(dataDeNascimento,JavaTimeUtils.LOCAL_DATE_FORMATTER);
			return repository.findByDataDeNascimento(localDate);
		}
	}

}
