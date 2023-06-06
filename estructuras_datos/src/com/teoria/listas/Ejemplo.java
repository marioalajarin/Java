package com.teoria.listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interfaz List que será implementada por las tres que tenemos abajo.
		//se utiliza index : AutoIncrement de mysql (por poner un ejemplo), solo listas.
		
		
		
		//ArrayList: no sincronizado - solo tiene un bloque - el tamaño se adapta - admite duplicados - tipado fuerte
		//Muestra orden en base al  orden en el que se insertó.
		//SE USA PARA INSERT
		ArrayList<Integer>lista=new ArrayList<>();
		lista.add(15);
		lista.add(20);
		lista.add(15);
		
		//Recorrer AL con programación funcional
		lista.forEach(item -> {System.out.println(item);});
		lista.remove(2);
		lista.forEach(item -> {System.out.println(item);});
		//Vector
		System.out.println("----------------- VECTORES -----------------");
		Vector<Integer>vector=new Vector<>();
		vector.add(15);
		vector.add(20);
		vector.add(15);
		
		//Recorrer AL con programación funcional
		vector.forEach(item -> {System.out.println(item);});
		vector.remove(2);
		vector.forEach(item -> {System.out.println(item);});
		
		
		//LinkedList : enlaza los elementos, pero rendimiento al insert/update/delete pero mejor rendimiento con select.
		//SE USA PARA SELECT
		System.out.println("----------------- LISTA ENLAZADA -----------------");
		LinkedList<Integer>lista_enlazada=new LinkedList<>();
		lista_enlazada.add(15);
		lista_enlazada.add(20);
		lista_enlazada.add(15);
		
		//Recorrer AL con programación funcional
		lista_enlazada.forEach(item -> {System.out.println(item);});
		lista_enlazada.remove(2);
		lista_enlazada.forEach(item -> {System.out.println(item);});
		
		
	}//Cierra main

}//Cierra la clase
