package br.com.dio.bill.academiadigital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

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

	@NotEmpty(message = "Um nome é obrigatório !")
	@Size(min = 3, max = 50, message = "`${validatedValue}` precisa estar entre {min} e {max} caracteres .")
	private String nome;

	@NotEmpty(message = "Um CPF é obrigatório !") 
	@CPF(message = "`${validatedValue}` é inválido !")
	private String cpf;

	@NotEmpty(message = "Um bairro é obrigatório !")
	@Size(min = 3, max = 50, message = "`${validatedValue}` precisa estar entre {min} e {max} caracteres .")  
	private String bairro;

	@NotNull(message = "Uma data é obrigatória !")
	@Past(message = "Data `${validatedValue}` é inválida .")
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dataDeNascimento;
}
