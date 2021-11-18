package com.bootcamp.nttdata.examenStarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "almacen")
public class AlmacenProperties {

	private Almacen almacen;

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	
	
	
	
}
