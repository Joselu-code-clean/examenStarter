package com.bootcamp.nttdata.examenStarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Almacen.class)
@EnableConfigurationProperties(AlmacenProperties.class)
public class AlmacenAutoConfigure {
	
	private final AlmacenProperties properties;

	public AlmacenAutoConfigure(AlmacenProperties properties) {
		super();
		this.properties = properties;
	}
	
	@Bean
	public Almacen comprobarAlmacen() {
		System.out.println("Creando Bean del almacen... " + properties.getAlmacen());
		return new Almacen();
	}

}
