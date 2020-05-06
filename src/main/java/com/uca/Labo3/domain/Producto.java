package com.uca.Labo3.domain;

public class Producto {
	
	private Integer id;
	private String nombre;
	private Integer cantidad;
	
	public Producto() {}
	
	public Producto(Integer id, String nombre, Integer cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
}