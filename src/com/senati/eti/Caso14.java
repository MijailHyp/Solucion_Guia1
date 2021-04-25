package com.senati.eti;
 
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese número: ");
		int n = sc.nextInt();
		
		// Sumatoria
		// n = 4 
		// r = 1 + 2 + 3 + 4  --> 10
		// r = (4 x(4+1)) / 2 --> 10
		
		int r = (n *(n + 1)) / 2;
		
		System.out.println("\nResultados");
		System.out.println("------------------");
		System.out.println("Sumatoria.........: " + r);
	}
}
