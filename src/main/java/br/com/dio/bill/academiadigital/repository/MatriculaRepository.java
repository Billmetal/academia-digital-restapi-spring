package br.com.dio.bill.academiadigital.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.dio.bill.academiadigital.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula,Long>{

	/**
	 * 
	 * @param bairro bairro referencia para o filtro
	 * @return lista de alunos matriculados com o bairro passado.
	 * **/
//	List<Matricula> findByAlunoBairro(String bairro);
	
//	@Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
	
	@Query(value = "SELECT * FROM tb_matriculas m INNER JOIN tb_alunos a ON m.aluno_id = a.id "+
			"WHERE a.bairro = :bairro", nativeQuery = true)
	List<Matricula> findByAlunoBairro(String bairro);
}
