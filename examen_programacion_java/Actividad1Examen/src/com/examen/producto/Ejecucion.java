package com.examen.producto;

import java.util.ArrayList;

public class Ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Frutas> almacen = new ArrayList<>();
		almacen.add(new Frutas("Manzana", 9.95, 100, 80, "15/03/2021"));
        almacen.add(new Frutas("Peras", 15.95, 150, 95, "21/03/2021"));
        almacen.add(new Frutas("Naranjas", 7.95, 100, 75, "20/03/2021"));
        
        double totalInventario = 0;
        for (Almacen producto : almacen) {
            totalInventario += producto.calcularValorAlmacen();
        }
        System.out.println("El valor total del inventario es: " + totalInventario);
    }
}

