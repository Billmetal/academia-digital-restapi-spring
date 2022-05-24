package br.com.dio.bill.academiadigital.infra.jackson.deser;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import br.com.dio.bill.academiadigital.infra.utils.JavaTimeUtils;

public class LocalDateDeserializer extends StdDeserializer<LocalDate>{

	

	public LocalDateDeserializer() {
		super(LocalDate.class);
	}

	private static final long serialVersionUID = 735334822013203238L;

	@Override
	public LocalDate deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {
		return LocalDate.parse(p.readValueAs(String.class), JavaTimeUtils.LOCAL_DATE_FORMATTER);
	}

}
