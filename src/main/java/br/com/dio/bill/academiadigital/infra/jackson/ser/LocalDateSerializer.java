package br.com.dio.bill.academiadigital.infra.jackson.ser;

import java.io.IOException;
import java.time.LocalDate;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import br.com.dio.bill.academiadigital.infra.utils.JavaTimeUtils;

public class LocalDateSerializer extends StdSerializer<LocalDate>{

	
	private static final long serialVersionUID = 3092684153686738834L;

	public LocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(final LocalDate value, final JsonGenerator generator, final SerializerProvider provider) throws IOException {
        generator.writeString(value.format(JavaTimeUtils.LOCAL_DATE_FORMATTER));
    }
}
