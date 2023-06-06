package com.examen.producto;

public class Productos {
	private int unidadesenStock;
	private int unidadesenPedido;
	private String fechaCaducidad;
	public Productos(int unidadesenStock, int unidadesenPedido, String fechaCaducidad) {
		super();
		this.unidadesenStock = unidadesenStock;
		this.unidadesenPedido = unidadesenPedido;
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getUnidadesenStock() {
		return unidadesenStock;
	}
	public void setUnidadesenStock(int unidadesenStock) {
		this.unidadesenStock = unidadesenStock;
	}
	public int getUnidadesenPedido() {
		return unidadesenPedido;
	}
	public void setUnidadesenPedido(int unidadesenPedido) {
		this.unidadesenPedido = unidadesenPedido;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	
}
