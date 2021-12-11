package br.com.generation.exercicios;

import java.util.Scanner;

public class segundo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float num1, par = 0, impar = 0;
		
		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o número: ");
				num1 = leia.nextFloat();
				
			if (num1 % 2 == 0) {
				
				par = par + 1;
			}
		}
		
		impar = 10 - par; 
		
		System.out.println("Contagem de números pares: " + par);
		System.out.println("Contagem de números ímpares: " + impar);
		
		leia.close();
	}

}
