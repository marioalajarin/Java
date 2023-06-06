package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaExcepciones {

	private JFrame frame;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaExcepciones window = new VentanaExcepciones();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaExcepciones() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 497, 354);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNum1 = new JLabel("Dime el número 1");
		lblNum1.setBounds(27, 23, 107, 14);
		frame.getContentPane().add(lblNum1);
		
		JLabel lblNum2 = new JLabel("Dime el número 2");
		lblNum2.setBounds(27, 99, 121, 14);
		frame.getContentPane().add(lblNum2);
		
		final JLabel lblSolucion = new JLabel(".................");
		lblSolucion.setBounds(27, 192, 311, 14);
		frame.getContentPane().add(lblSolucion);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(144, 20, 86, 20);
		frame.getContentPane().add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(144, 96, 86, 20);
		frame.getContentPane().add(txtNum2);
		txtNum2.setColumns(10);
		
		JButton btnSolucion = new JButton("Dividir");
		btnSolucion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(txtNum1.getText());
				int num2=Integer.parseInt(txtNum2.getText());
				
				
				try {
					int solucion=num1/num2;
					lblSolucion.setText("El resultado es "+solucion);
				} catch (ArithmeticException e2) {
					lblSolucion.setText("No se puede dividir entre 0");
				}catch (Exception e2) {
					lblSolucion.setText("Error general");
				}
			}
		});
		btnSolucion.setBounds(27, 158, 89, 23);
		frame.getContentPane().add(btnSolucion);
	}
}
