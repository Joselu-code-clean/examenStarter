package com.bootcamp.nttdata.examenStarter.singleton;

import com.bootcamp.nttdata.examenStarter.Almacen;

public class SingletonAlmacen {
	
	private static SingletonAlmacen instance;
	
	private static Almacen almacen;
	
	private SingletonAlmacen(){};
	
	public static SingletonAlmacen getInstance() {
		 if (instance == null) {
	            instance = new SingletonAlmacen();
	            almacen = new Almacen();
	            
	   }else {
	   	 System.out.println("No se puede una nueva instancia, ya hay una instancia creada.");
	   }
	   return instance;
	}

}
