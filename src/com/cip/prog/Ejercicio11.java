package com.cip.prog;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Crear un array de 10 enteros
		int[] numero;
		numero = new int[10];
		numero[0]= 1;
		numero[1] = 524;
		numero[2] = 423;
		numero[3] = 825;
		numero[4] = 1524;
		numero[5] = 324;
		numero[6]= 899;
		numero[7] = 975;
		numero[8]= 775;
		numero[9] = 657;
		int i;
		int mayor = 0;
		
		for( i =0; i< numero.length;i++) {
			System.out.println(numero[i]);
		
			if (numero[i]>mayor) {
				
				mayor = numero[i];
				
			}
						
			
		}
		
		System.out.println("El mayor es:" +mayor);

	}

}
