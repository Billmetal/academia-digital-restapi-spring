package br.com.dio.bill.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.bill.academiadigital.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno,Long> {

}
