package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Calcular el factorial
		
		int n =Integer.parseInt(JOptionPane.showInputDialog("introdusca el numero factorial"));
		long factorial=1;
        
        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + n + " es: " + factorial);
	}

}
