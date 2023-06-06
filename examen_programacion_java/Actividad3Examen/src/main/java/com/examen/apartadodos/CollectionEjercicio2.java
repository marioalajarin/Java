package com.examen.apartadodos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> datos = new HashMap<>();
        datos.put("Madrid", 50);
        datos.put("Sevilla", 40);
        datos.put("Madrid", 35);
        datos.put("Valencia", 81);
        
        Map<String, Integer> datosOrdenados = new TreeMap<>(datos);
        for (Map.Entry<String, Integer> entry : datosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
	}

}
