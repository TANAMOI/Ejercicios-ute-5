package com.cip.prog;

import javax.swing.JOptionPane;
import java.util.*;


public class Ejercicio6 {

	public static void main(String[] args) {
		// Calcular la raiz cuadrada de un numero hasta que se introduzca un número negativo
		
		//double n = Double.parseDouble(JOptionPane.showInputDialog("Introdusca el Nº para calcualar su raiz"));

		Scanner sc = new Scanner (System.in);
		
		
		double numero=0;
		
		while (numero >= 0){
			
		 numero = Double.parseDouble(JOptionPane.showInputDialog("introdusca un numero"));
			
					
			if(numero>=0){
				
			
			System.out.printf("La raiz cuadrada es: %.2f\n", Math.sqrt(numero));
			}
			
			
	}
		System.out.println("El programa solo calcula la raiz de Nº positivos");
		sc.close();

	}

}
