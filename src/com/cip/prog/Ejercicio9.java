package com.cip.prog;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	public static void main(String[] args) {
		// calcular la tabla de multiplicar
		
		int n =Integer.parseInt(JOptionPane.showInputDialog("Introdusca el Nº que desea hallar la tabla"));
		
		for(int i = 0; i <=10; i++) {
			
			
			System.out.println(n +" * "+i+ "="+ n*i);
			
		}


	}

}
