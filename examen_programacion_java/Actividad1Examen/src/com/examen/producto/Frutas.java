package com.examen.producto;

public class Frutas extends Productos implements Almacen {
	private String nombreProducto;
	private double precioUnitario;
	public Frutas(String nombreProducto,double precioUnitario,int unidadesenStock, int unidadesenPedido, String fechaCaducidad
			) {
		super(unidadesenStock, unidadesenPedido, fechaCaducidad);
		this.nombreProducto = nombreProducto;
		this.precioUnitario = precioUnitario;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	
	public double calcularValorAlmacen() {
        int unidadesDisponibles = getUnidadesenStock() - getUnidadesenPedido();
        return unidadesDisponibles * precioUnitario;
    }
	
}
