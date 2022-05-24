package br.com.dio.bill.academiadigital.entity.form;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import br.com.dio.bill.academiadigital.infra.jackson.deser.LocalDateDeserializer;
import br.com.dio.bill.academiadigital.infra.jackson.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

	 private String nome;

	 
	 private String cpf;

	  
	 private String bairro;

	 @JsonDeserialize(using = LocalDateDeserializer.class)
	 @JsonSerialize(using = LocalDateSerializer.class)
	 private LocalDate dataDeNascimento;
}
