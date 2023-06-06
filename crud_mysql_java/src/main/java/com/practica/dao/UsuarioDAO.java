package com.practica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.practica.model.Usuario;


public class UsuarioDAO {
	private String endpoint="jdbc:mysql://localhost:3306/pruebaexamen";
	private String user="root";
	private String pass="";
	
	public Connection conectar() {
		Connection connection =null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(endpoint, user, pass);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}//cierra método conectar
	
	//insertar
	public void insertUsuario(Usuario u) {
        
        // try-with-resource statement will auto close the connection.
       
        	Connection connection = conectar();
        	PreparedStatement ps;
			try {
				ps = connection.prepareStatement("INSERT INTO usuarios(nombre,correo,password) VALUES (?,?,?);");
	        	ps.setString(1, u.getNombre());
	        	ps.setString(2, u.getCorreo());
	        	ps.setString(3, u.getPassword());
	        	ps.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        
    }//cierra insertar
	public Usuario selectUsuario(int id) {
		Usuario usuario=null;
		return usuario;
		
	}//cierra selectUsuario
	
	public List<Usuario> listaUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		String selectall="SELECT * FROM usuarios;";
		try {
			Connection connection = conectar();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(selectall);
			
			while(rs.next()) {
				Usuario usuario = new Usuario();
				usuario.setId(rs.getInt("id"));
				usuario.setNombre(rs.getString("nombre"));
				usuario.setCorreo(rs.getString("correo"));
				usuario.setPassword(rs.getString("password"));
				
				usuarios.add(usuario);
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return usuarios;
		
	}//cierra listaUsuarios
	
	
	public boolean deleteUsuario(int id) {
		boolean filaBorrada = true;
		Connection connection = conectar();
    	PreparedStatement ps;
		try {
			ps = connection.prepareStatement("DELETE FROM usuarios WHERE id=?;");
        	ps.setInt(1,id);
        	filaBorrada=ps.executeUpdate() >0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return filaBorrada;
	}

	
	//resto de métodos CRUD
}
