package com.examen.apartadouno;

import java.util.ArrayList;
import java.util.Collections;

public class ListadoEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Madrid");
		lista.add("Sevilla");
		lista.add("Madrid");
		lista.add("Valencia");
		lista.add("Sevilla");
		lista.add("Madrid");
		
		Collections.sort(lista);
		for(String elemento:lista) {
			System.out.println(elemento);
		}
	}

}
