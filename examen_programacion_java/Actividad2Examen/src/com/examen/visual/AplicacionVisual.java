package com.examen.visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AplicacionVisual extends JFrame {

	private JPanel contentPane;
	private JTextField txtFieldCorreo;
	private JTextField txtFieldUnidades;
	public String productoSeleccionado="";
	public double precioProducto=0;
	public double iva=1.21;
	public double envioUrgente=9.99;
	public double precioTotal=0;
	public int stock=0;
	public String tipoEnvio="";
	public double precioTotalConIva=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionVisual frame = new AplicacionVisual();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AplicacionVisual() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 389);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 64));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFieldCorreo = new JTextField();
		txtFieldCorreo.setBounds(77, 25, 86, 20);
		contentPane.add(txtFieldCorreo);
		txtFieldCorreo.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo:");
		lblCorreo.setBounds(21, 28, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblUnidades = new JLabel("Unidades:");
		lblUnidades.setBounds(21, 63, 65, 14);
		contentPane.add(lblUnidades);
		
		txtFieldUnidades = new JTextField();
		txtFieldUnidades.setBounds(87, 60, 86, 20);
		contentPane.add(txtFieldUnidades);
		txtFieldUnidades.setColumns(10);
		
		JComboBox comboPago = new JComboBox();
		comboPago.setModel(new DefaultComboBoxModel(new String[] {"tarjeta", "efectivo", "paypal"}));
		comboPago.setBounds(122, 93, 74, 22);
		contentPane.add(comboPago);
		
		JLabel lblPago = new JLabel("Método de pago:");
		lblPago.setBounds(21, 95, 91, 18);
		contentPane.add(lblPago);
		
		JLabel lblProducto = new JLabel("Elija un producto:");
		lblProducto.setBounds(21, 124, 91, 14);
		contentPane.add(lblProducto);
		
		final JComboBox comboProducto = new JComboBox();
		comboProducto.setModel(new DefaultComboBoxModel(new String[] {"Mesa", "Silla", "Lámpara", "Sofá"}));
		comboProducto.setBounds(122, 120, 74, 22);
		contentPane.add(comboProducto);
		
		final JCheckBox checkboxPrivacidad = new JCheckBox("Acepta política de privacidad");
		
		checkboxPrivacidad.setBounds(21, 165, 188, 23);
		contentPane.add(checkboxPrivacidad);
		
		final JButton btnComprar = new JButton("Comprar");
		
		btnComprar.setEnabled(false);
		btnComprar.setBounds(21, 213, 89, 23);
		contentPane.add(btnComprar);
		
		final JLabel lblMensajeCompra = new JLabel("");
		lblMensajeCompra.setBounds(122, 217, 188, 14);
		contentPane.add(lblMensajeCompra);
		
		JButton btnCalcularPrecio = new JButton("Calcular precio (sin IVA)");
		
		btnCalcularPrecio.setBounds(291, 24, 204, 23);
		contentPane.add(btnCalcularPrecio);
		
		final JLabel lblMensajeCalculo = new JLabel("");
		lblMensajeCalculo.setBounds(291, 63, 204, 14);
		contentPane.add(lblMensajeCalculo);
		
		JButton btnFinalizarCompra = new JButton("Finalizar compra");
		
		btnFinalizarCompra.setBounds(291, 165, 204, 23);
		contentPane.add(btnFinalizarCompra);
		
		final JComboBox comboTipoEnvio = new JComboBox();
		comboTipoEnvio.setModel(new DefaultComboBoxModel(new String[] {"Envío urgente", "Envío normal", "Recogida en tienda"}));
		comboTipoEnvio.setBounds(291, 213, 193, 22);
		contentPane.add(comboTipoEnvio);
		
		final JLabel lblFinalizarCompra = new JLabel("");
		lblFinalizarCompra.setBounds(291, 274, 204, 14);
		contentPane.add(lblFinalizarCompra);
		checkboxPrivacidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(checkboxPrivacidad.isSelected()) {
					btnComprar.setEnabled(true);
				}else {
					btnComprar.setEnabled(false);
				}
			}
		});
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productoSeleccionado=comboProducto.getSelectedItem().toString();
				lblMensajeCompra.setText("Ha comprado "+productoSeleccionado);;
			}
		});
		btnCalcularPrecio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				productoSeleccionado=comboProducto.getSelectedItem().toString();
				stock=Integer.parseInt(txtFieldUnidades.getText());
				if(productoSeleccionado.equals("Mesa")) {
					precioProducto=7.95;
				}else if(productoSeleccionado.equals("Silla")){
					precioProducto=15.95;
				}else if(productoSeleccionado.equals("Lámpara")) {
					precioProducto=25.50;
				}else if(productoSeleccionado.equals("Sofá")) {
					precioProducto=9.99;
				}
				precioTotal=stock*precioProducto;
				lblMensajeCalculo.setText("El precio total es de "+precioTotal+"€");
			}
		});
		btnFinalizarCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tipoEnvio=comboTipoEnvio.getSelectedItem().toString();
				if(tipoEnvio.equals("Envío urgente")) {
					precioTotalConIva=(precioTotal+9.99)*iva;
					lblFinalizarCompra.setText("El precio con el IVA es de "+precioTotalConIva+"€");
				}else {
					precioTotalConIva=(precioTotal)*iva;
					lblFinalizarCompra.setText("El precio con el IVA es de "+precioTotalConIva+"€");
				}
			}
		});
	}
}
