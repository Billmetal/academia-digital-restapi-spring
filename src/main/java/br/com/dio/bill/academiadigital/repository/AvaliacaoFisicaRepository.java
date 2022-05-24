package br.com.dio.bill.academiadigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.bill.academiadigital.entity.AvaliacaoFisica;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica,Long>{

}
