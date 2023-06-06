package com.examen.apartadouno;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CiudadesServlet
 */
@WebServlet("/CiudadesServlet")
public class CiudadesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ArrayList<String> lista = new ArrayList<String>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CiudadesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
        request.getRequestDispatcher("ver_ciudades.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    String elemento = request.getParameter("nombre_ciudad");
	    lista.add(elemento);
	    Collections.sort(lista);
	    request.setAttribute("lista", lista);
	    doGet(request, response);
	    
	    
	}

}
