package com.practica.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practica.dao.UsuarioDAO;
import com.practica.model.Usuario;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDAO usuarioDAO;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		usuarioDAO = new UsuarioDAO();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		//routing
		switch (action) {
		case "/add":
			addUsuario(request,response);
			break;
		case "/update":
			updateUsuario(request,response);
			break;
		case "/select":
			selectUsuario(request,response);
			break;
		case "/delete":
			deleteUsuario(request,response);
		}//cierra switch
		
	}//Cierra doGet

	private void deleteUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("id"));
		usuarioDAO.deleteUsuario(id);
		response.sendRedirect("pagina-principal.jsp");
	}

	private void updateUsuario(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void selectUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebaexamen","root","");
			
			String select="SELECT * FROM usuarios WHERE id=?;";
			
			PreparedStatement ps=connection.prepareStatement(select);
			ps.setInt(1, Integer.parseInt(request.getParameter("id")));
			
			ResultSet rs = ps.executeQuery();
			request.setAttribute("resultSet", rs);
			RequestDispatcher rd=request.getRequestDispatcher("ver-usuario.jsp");
			rd.forward(request,response);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void addUsuario(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		
		String nombre=request.getParameter("nombre");
		String correo=request.getParameter("correo");
		String password=request.getParameter("password");
		
		Usuario usuario=new Usuario(nombre, correo, password);
		UsuarioDAO dao=new UsuarioDAO();
		//response.getWriter().append(usuario.toString());
		//System.out.println(usuario.toString());
		dao.insertUsuario(usuario);
		response.getWriter().append("usuario guardado ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
