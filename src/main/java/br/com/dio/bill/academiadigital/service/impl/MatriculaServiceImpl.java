package br.com.dio.bill.academiadigital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.bill.academiadigital.entity.Aluno;
import br.com.dio.bill.academiadigital.entity.Matricula;
import br.com.dio.bill.academiadigital.entity.form.MatriculaForm;
import br.com.dio.bill.academiadigital.repository.AlunoRepository;
import br.com.dio.bill.academiadigital.repository.MatriculaRepository;
import br.com.dio.bill.academiadigital.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private MatriculaRepository matriculaRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();
		Matricula matricula = new Matricula();
		matricula.setAluno(aluno);;
		return matriculaRepository.save(matricula);
	}

	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Matricula> getAll() {
		return matriculaRepository.findAll();
	}

}
