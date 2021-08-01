package com.proyectoLUIS.Controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.proyectoLuisWeb.ProductoDAO;
import com.proyectoLuisWeb.ProductoPojo;

/**
 * Servlet implementation class LuisController
 */
@WebServlet("/LuisController")
public class LuisController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ProductoDAO modeloProducto = new ProductoDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LuisController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion = request.getParameter("accion");
		Integer id;

		if (accion.equals("nuevo")) {
			System.out.println("nuevo");
			response.sendRedirect("producto_nuevo.jsp");

		} else if (accion.equals("calculadora")) {
			System.out.println("calculadora");
			RequestDispatcher dispatcher = request.getRequestDispatcher("calculadora.jsp");
			dispatcher.forward(request, response);

		} else if (accion.equals("insertar")) {
			System.out.println("insertar");
			String nombre = request.getParameter("nombre");
			String tipo = request.getParameter("tipo");
			String precio = (request.getParameter("precio"));
			String fecha = request.getParameter("fecha");
			if (nombre.equals("") || nombre == null || tipo.equals("") || tipo == null || precio == null || precio.equals("")
					|| fecha == null || fecha.equals("")) {
				request.setAttribute("mensaje", "Debe rellenar todos los campos");
				RequestDispatcher dispatcher = request.getRequestDispatcher("producto_nuevo.jsp");
				dispatcher.forward(request, response);
			} else {
				Date fechaOk = Date.valueOf(request.getParameter("fecha"));
				Double precioOk = Double.parseDouble((request.getParameter("precio")));
				ProductoPojo producto = new ProductoPojo(0, nombre, tipo, precioOk, fechaOk);
				modeloProducto.addProducto(producto);

				response.sendRedirect("LuisController?accion=default");
			}

		} else if (accion.equals("eliminar")) {
			System.out.println("Eliminar");
			id = Integer.parseInt(request.getParameter("id"));
			if (id != null) {
				modeloProducto.deleteProducto(id);
			}
			response.sendRedirect("LuisController?accion=default");

		} else if (accion.equals("editar")) {
			System.out.println("Editar");
			id = Integer.parseInt(request.getParameter("id"));
			if (id != null) {
				ProductoPojo prod = modeloProducto.getProducto(id);
				request.setAttribute("producto", prod);
				RequestDispatcher dispatcher = request.getRequestDispatcher("producto_editar.jsp");
				dispatcher.forward(request, response);

			}

		} else if (accion.equals("actualizar")) {
			System.out.println("actualizar");
			id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("nombre");
			String tipo = request.getParameter("tipo");
			String precio = request.getParameter("precio");
			String fecha = request.getParameter("fecha");
			if (nombre.equals("") || nombre == null || tipo.equals("") || tipo == null || precio.equals("") || precio == null
					|| fecha == null || fecha.equals("")) {
				request.setAttribute("mensaje", "Debe rellenar todos los campos");
				RequestDispatcher dispatcher = request.getRequestDispatcher("LuisController?accion=editar");
				dispatcher.forward(request, response);
			} else {
				Date fechaOk = Date.valueOf(request.getParameter("fecha"));
				Double precioOk = Double.parseDouble((request.getParameter("precio")));
				ProductoPojo producto = new ProductoPojo(id, nombre, tipo, precioOk, fechaOk);
				modeloProducto.updateProducto(producto);

				response.sendRedirect("LuisController?accion=default");
			}

		} else if (accion.equals("tienda")) {
			response.sendRedirect("tienda.jsp");

		} else if (accion.equals("linkedin")) {
			response.sendRedirect("https://www.linkedin.com/in/luis-javier-flores-alviarez-a49208184/");

		} else if (accion.equals("github")) {
			response.sendRedirect("https://github.com/ljflores1209");
			
		} else if (accion.equals("ranking")) {
		} else if (accion.equals("ranking")) {

		} else {
			System.out.println("producto.default");
			List<ProductoPojo> productos = modeloProducto.getProductos();
			request.setAttribute("productos", productos);
			RequestDispatcher dispatcher = request.getRequestDispatcher("productos.jsp");
			dispatcher.forward(request, response);

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
