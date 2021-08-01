package com.proyectoLuisWeb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class ProductoDAO {

	// Tengo que crear una conexi�n a la base de datos
	private Connection con;
	private int max_records = 100;

	public ProductoDAO() {
		try {
			// Me conecto a la base de datos. Si no da error todo OK
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_luis", "root", "");
			System.out.println("conexion OK!");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

	public ProductoPojo getProducto(int id) {
		try {
			String sql = "select * from producto where id_producto=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {

				ProductoPojo producto = new ProductoPojo(rs.getInt("id_producto"), rs.getString("nombre"),
						rs.getString("tipo"), rs.getDouble("precio"), rs.getDate("fecha"));
				return producto;
			} else {
				return null;
			}

		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

	public List<ProductoPojo> getProductos() {
		try {
			// Consulta sql para obtener todas las categor�as
			String sql = "select * from producto limit ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			// Con la salvedad de que ponemos un l�mite de 1000 registros por si acaso
			stmt.setInt(1, max_records);

			// Obtenemos el puntero a los resultados
			ResultSet rs = stmt.executeQuery();

			// Yo necesito almacenar todos los registros que voy obteniendo
			// �D�nde? En un ArrayList del tipo Categoria
			List<ProductoPojo> productos = new ArrayList<ProductoPojo>();

			// MIentras haya registros en la base de datos
			while (rs.next()) {
				// Creame un objeto producto con los datos de la base de datos
				ProductoPojo producto = new ProductoPojo(rs.getInt("id_producto"), rs.getString("nombre"),
						rs.getString("tipo"), rs.getDouble("precio"), rs.getDate("fecha"));
				// Lo a�adimos al arraylist
				productos.add(producto);
			}
			// Devolvemos la lista con todas los productos que hemos creado
			// A partir de los registros de la base de datos
			return productos;
		} catch (Exception ex) {
			System.out.println(ex);
			return null;
		}
	}

	// Crear un producto
	public int addProducto(ProductoPojo producto) {
		try {
			String sql = "insert into producto (nombre,tipo, precio,fecha) values (?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, producto.getNombre());
			stmt.setString(2, producto.getTipo());
			stmt.setDouble(3, producto.getPrecio());
			stmt.setDate(4, producto.getFecha());

			int res = stmt.executeUpdate();
			return res;
		} catch (Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}

	public int deleteProducto(int id) {
		try {
			String sql = "delete from producto where id_producto=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setInt(1, id);

			int res = stmt.executeUpdate();
			return res;

		} catch (Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}

	public int updateProducto(ProductoPojo producto) {
		try {
			String sql = "update producto set nombre=?, tipo=?, precio=?, fecha=? where id_producto=?";
			PreparedStatement stmt = con.prepareStatement(sql);

			stmt.setString(1, producto.getNombre());
			stmt.setString(2, producto.getTipo());
			stmt.setDouble(3, producto.getPrecio());
			stmt.setDate(4, producto.getFecha());
			stmt.setInt(5, producto.getId_producto());

			int res = stmt.executeUpdate();
			return res;
		} catch (Exception ex) {
			System.out.println(ex);
			return -1;
		}
	}

}
