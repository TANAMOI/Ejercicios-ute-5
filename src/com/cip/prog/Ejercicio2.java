package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Pedir dos numeros e indicar cual es mayor
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el primer n�mero"));
		
		int b = Integer.parseInt(JOptionPane.showInputDialog("Introdusca el segundo n�mero"));
		
		if (a == b) {
			
			System.out.println("Los n�meros introducidos son iguales");
		}
		else if (a>b) {
			System.out.println("El n�mer " + a + " es mayor que " + b);
			
								
		}
		else {
			
			System.out.println("El n�mero "+a+ " es menor que " + b);
		}
		
			
	
		
		

	}

}
