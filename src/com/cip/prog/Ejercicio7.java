package com.cip.prog;

import javax.swing.JOptionPane;
import java.util.*;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Hacer un menu para calcular objetos

		Scanner sc = new Scanner(System.in);

		int opcion;

		do {
			System.out.println("Elige una opcion: ");
			System.out.println("1. Calcuar la raiz");
			System.out.println("2. Calcular el cuadrado");
			System.out.println("0. Salir");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				double r = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el numero deseado:"));
				double raiz = Math.sqrt(r);
				System.out.printf("La raiz cuadrada es: %.2f\n", raiz);
				break;

			case 2:
				int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
				double cuadrado = Math.pow(lado, 2);

				System.out.println("El cuadrado es: " + cuadrado);
				break;

			case 0:
				System.out.println("bye");
			break;
				
			default:
				System.out.println("Introdusca una opcion correcta");
			}

		} while (opcion != 0);

	}

}
