package com.teoria.mapas;

import java.util.HashMap;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tabla Cliente pk AI-identity: index: List (admite duplicados)/Set (no admite duplicados)
		//tabla Cliente pk NO AI.dni: key: Map
		
		
		//Interfaz Map: no tiene index y si tiene key
		
		//HashMap
		HashMap<String, Cliente>hm=new HashMap<>();
		hm.put("123M", new Cliente("Juan","Madrid"));
		hm.put("456B", new Cliente("María","Cáceres"));
		hm.put("789A", new Cliente("Pepe","Málaga"));
		hm.put("012C", new Cliente("Juan","Madrid"));
		
		hm.forEach((k,v)->System.out.println(v.getNombre()));
		//TreeMap - nodos
		
		//HastTable - HT - concurrente - thread-safe
		
		
		
		
	}//Cierra main

}//Cierra class
