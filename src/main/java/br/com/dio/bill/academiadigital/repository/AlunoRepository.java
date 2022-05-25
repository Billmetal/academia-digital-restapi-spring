package br.com.dio.bill.academiadigital.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.bill.academiadigital.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {

	/**
	 * 
	 * @param dataDeNascimento: data de nascimento dos alunos
	 * @return lista com todos alunos com data de nascimento passada no parâmetro
	 * **/
	List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
}
