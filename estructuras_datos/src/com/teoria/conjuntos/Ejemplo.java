package com.teoria.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inerfaz conjuntos Set - no admite duplicados
		
		//HashSet --mejor para insert, update y delete, peor rendimiento para select
		//muestra elementos ordenados en base a un hash (NO EN BASE A UN INDEX)
		//InnoDB por ejemplo
		System.out.println("HashSet");
		HashSet<String>hs=new HashSet<>();
		hs.add("Madrid");
		hs.add("Sevilla");
		hs.add("Madrid");
		hs.add("Córdoba");
		hs.forEach(item -> {System.out.println(item);});
		
		//LinkedHashSet --mejor rendimiento para select
		//myISAM por ejemplo
		System.out.println("LinkedHashSet");
		LinkedHashSet<String>lhs=new LinkedHashSet<>();
		lhs.add("Madrid");
		lhs.add("Sevilla");
		lhs.add("Madrid");
		lhs.add("Córdoba");
		lhs.forEach(item -> {System.out.println(item);});
		//TreeSet
		//Set es una interfaz		Set<String>s=new Set<>();
	}

}
