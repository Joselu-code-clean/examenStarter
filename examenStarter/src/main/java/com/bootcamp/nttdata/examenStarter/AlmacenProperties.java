package com.bootcamp.nttdata.examenStarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.bootcamp.nttdata.examenStarter.singleton.SingletonAlmacen;

@ConfigurationProperties(prefix = "almacen")
public class AlmacenProperties {

	private SingletonAlmacen almacen = SingletonAlmacen.getInstance();

	public SingletonAlmacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(SingletonAlmacen almacen) {
		this.almacen = almacen;
	}

	
	
	
	
}
