package com.bootcamp.nttdata.examenStarter;

import java.util.ArrayList;
import java.util.List;

import com.bootcamp.nttdata.examenStarter.singleton.SingletonAlmacen;

public class Almacen {
	
	/*SINGLETON*/
	private static SingletonAlmacen instanciaAlmacen;
	
	List<Producto> almacen;
	
	/*CONSTRUCTOR*/
	public Almacen() {
		super();
		this.almacen = new ArrayList<Producto>();
	}
	
	/*GET AND SET: Creo que no hacen falta, ya que para eso estan los metodo de abajo*/
	
	public List<Producto> getAlmacen() {
		return almacen;
	}
	public void setAlmacen(List<Producto> almacen) {
		this.almacen = almacen;
	}
	
	/*METODOS DE INSERCION, CONSULTAR, MODIFICAR*/
	
	public void insertarProducto(Producto producto) {
		this.almacen.add(producto);
	}
	
	public void eliminarProducto(int id) {
		this.almacen.remove(id);
	}
	
	public List<Producto> consultarAlmacen(){
		return this.almacen;
	}
	

}
