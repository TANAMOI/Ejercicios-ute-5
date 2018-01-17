package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir dos numeros e indicar cual es mayor
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el primer número"));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el segundo número"));
		
		if (a == b) {
			
			System.out.println("Los números introducidos son iguales");
		}
		else if (a>b) {
			System.out.println("El númer " + a + " es mayor que " + b);
			
								
		}
		else {
			
			System.out.println("El número "+a+ " es menor que " + b);
		}
		
			
	
		
		

	}

}
