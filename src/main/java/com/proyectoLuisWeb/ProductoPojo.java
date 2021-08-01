package com.proyectoLuisWeb;

import java.sql.Date;

public class ProductoPojo {

	private int id_producto;
	private String nombre;
	private String tipo;
	private double precio;
	private Date fecha;

	public ProductoPojo(int id_producto, String nombre, String tipo, double precio, Date fecha) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.precio = precio;
		this.fecha = fecha;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "ProductoPojo [id_producto=" + id_producto + ", nombre=" + nombre + ", tipo=" + tipo + ", precio="
				+ precio + ", fecha=" + fecha + "]";
	}

}
