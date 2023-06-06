package com.practica.ejercicio;

import java.util.HashMap;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Almacena para cada dia de la semana un menú, el menú está formado por
		 * comida, bebida y postre, muestra todos los menús de la semana*/
		
		HashMap<String, Menu>menu=new HashMap<>();
		menu.put("Lunes", new Menu("Filete","Zumo de naranja","Pudding"));
		menu.put("Martes", new Menu("Fideua","Limonada","Helado"));
		menu.put("Miercoles", new Menu("Cocido","Cerveza","Tiramisu"));
		menu.put("Jueves", new Menu("Fabada","Vino tinto","Cheesecake"));
		menu.put("Viernes", new Menu("Hamburguesa","Vodka","Flan"));
		menu.put("Sabado", new Menu("Espaguetis","Vino blanco","Brownie"));
		menu.put("Domingo", new Menu("Pizza","Mosto","Galletas"));
		
		//utilizao printf para usar %s ya que como estoy llamando a Strings con esto puedo declarar cuantas voy a poner
		//%s -> Strings / %f -> float / %d -> int / %c -> char (1 letra)
		menu.forEach((k,v)->System.out.printf("%s: %s %s %s\n",k,v.getComida(),v.getBebida(),v.getPostre()));
		
	}//cierra main

}//cierra class
