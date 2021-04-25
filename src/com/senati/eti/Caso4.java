package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float num1 = 0, num2 = 0;

		System.out.println("Primer número...: ");
		num1 = sc.nextFloat();
		
		System.out.println("Primer número...: ");
		num2 = sc.nextFloat();
		
		float suma = num1 + num2;
		float resta = num1 - num2;
		float multiplicacion = num1 * num2;
		float division = num1 / num2;
		float resto = num1 % num2;
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Suma....: " + suma);
		System.out.println("Resta....: " + resta);
		System.out.println("Multiplicacion....:" + multiplicacion);
		System.out.println("division....:" + division);
		System.out.println("Resto entero....:"+ resto);
	}

}
