package com.cip.prog;

import javax.swing.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Indicar las notas dependiendo del valor numerico.
		
		double n = Double.parseDouble(JOptionPane.showInputDialog("Introdusca la nota del alumno"));
				
		if ((n>=0)&&(n<5)) {
			
			System.out.println("La nota del alumno es:\n insuficiente");
			
		}
		else if ((n>=5)&&(n<6)) {		
		System.out.println("La nota del alumno es:\n Suficiente");
		}
		else if((n>=6)&&(n<7)) {
			System.out.println("La nota del alumno es:\n Bien");
		}
		else if ((n>=7)&&(n<9)) {
			System.out.println("La nota del alumno es:\n Notable");
		}
		else if((n>=9)&&(n<=10)) {
			System.out.println("La nota del alumno es:\n Sobresaliente");
			
		}
		else {
			System.out.println("Introdusca un numero de 0 a 10");
		}

	}

}
