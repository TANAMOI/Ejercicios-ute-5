package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Calcular la dividion de 2 numeros y que no se pueda dividir por 0
		
		double a = Double.parseDouble(JOptionPane.showInputDialog("Introdusca el numerador"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Introdusca el denominador"));
		
		double c = (a/b);
		
		if(b == 0) {
			System.out.println("Introdusca un denominador distinto de " + "0");
		}
		else {
			System.out.println("El resultado es: "+c);
			
		}

	}

}
