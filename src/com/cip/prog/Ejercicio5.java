package com.cip.prog;

import javax.swing.*;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Pedir numeros y devolver los numeros pedidos
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Introdusca la nota numerica: "));
		
		switch (n) {
		
		case 0:
			System.out.println("La nota es 'cero'");
			break;
			
		case 1:
			System.out.println("La nota es 'uno'");
			break;
		case 2:
			System.out.println("La nota es 'dos'");
			break;
			
		case 3:
			System.out.println("La nota es 'tres'");
			break;
			
		case 4:
			System.out.println("La nota es 'cuatro'");
			break;
			
		case 5:
			System.out.println("La nota es 'cinco'");
			break;
			
		case 6:
			System.out.println("La nota es 'seis'");
			break;
		case 7:
			System.out.println("La nota es 'siete'");
			break;
		case 8:
			System.out.println("La nota es 'ocho'");
			break;
		case 9:
			System.out.println("La nota es 'nueve'");
			break;
		case 10:
			System.out.println("La nota es 'diez'");
			break;
		default: System.out.println("Introdusca un numero entre 0 y 10");	
			
		
		
		
		}
				
				
		
		

	}

}
