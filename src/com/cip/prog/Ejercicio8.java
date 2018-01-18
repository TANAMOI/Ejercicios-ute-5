package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	public static void main(String[] args) {
		// indicar si un numero es positivo o negativo
		
		int n =Integer.parseInt(JOptionPane.showInputDialog("Introdusca un numero"));
		
		while(n!=0) {
		
			if(n<0) {
			System.out.println("El numero"+n+" es negativo");
			
			}
			
			else if(n>0) {
			System.out.println("El numero "+n+" es positivo");
			}
			
		
			n =Integer.parseInt(JOptionPane.showInputDialog("Introdusca un numero"));
				
	
		}
		System.out.println("el programa ha terminado");
	}
	
	

}