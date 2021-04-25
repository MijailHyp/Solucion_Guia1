package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Número de aprobados.....: ");
		int na = sc.nextInt();
		System.out.println("Número de desaprobados..: ");
		int nd = sc.nextInt();
		System.out.println("Número de retirados.....: ");
		int nr = sc.nextInt();
		
		// Equivalente porcentual
		// 18 varones -> 18/19 -> 0.9474 x 100 -> 94.74%
		// 01 dama    -> 1/19  -> 0.0526 x 100 -> 5.26%
		
		// Candidato 1 --> 2594 -> 2594 / 7196 x 100 -> 36.05%
		// Candidato 2 --> 1682 -> 1682 / 7196 x 100 -> 23.67%
	    // Candidato 3 --> 1527 -> 1527 / 7196 x 100 -> 21.22%
	    // Candidato 4 --> 1393 -> 1393 / 7196 x 100 -> 19.35%
		//                 ----             
		// Total       --> 7196
		
		float total = na + nd + nr;
		
		float p_na = na / total * 100;
		float p_nd = nd / total * 100;
		float p_nr = nr / total * 100;
		
		System.out.println("\nResultados");
		System.out.println("------------");
		System.out.println("Aprobados........: " + df.format(p_na) + "%");
		System.out.println("Desaprobados.....: " + df.format(p_nd) + "%");
		System.out.println("Retirados........: " + df.format(p_nr) + "%");
   }
	
}
