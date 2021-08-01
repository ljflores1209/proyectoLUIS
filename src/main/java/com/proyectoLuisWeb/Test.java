package com.proyectoLuisWeb;

import java.sql.Date;

public class Test {

	public static void main(String[] args) {

		Date fecha=Date.valueOf("2021-03-04");
		ProductoDAO a=new ProductoDAO();
		System.out.println(a.getProducto(2));
		System.out.println(a.getProductos());
		ProductoPojo b=new ProductoPojo(0, "Silla", "Hogar", 12,  fecha );
		System.out.println(b.getPrecio());;
		
		

	}

}
