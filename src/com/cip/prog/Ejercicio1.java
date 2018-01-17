package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir si un nuemro es par o impar por pantall
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introdusca un número:"));
		
		if (n%2 == 0) {
			
			System.out.println("El numero introducido es par");
		}
		else {
			System.out.println("El numero introducido es impar");
			
			
		}
		
		
		

	}

}
