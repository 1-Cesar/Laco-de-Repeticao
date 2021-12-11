package br.com.generation.exercicios;

import java.util.Scanner;

public class terceiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int idade, contador1 = 0, contador2 = 0 ;
		
		System.out.println("Digite a idade (obs: para encerrar o programa digite -99): ");
			idade = leia.nextInt();
			
		while (idade != -99) {
			if (idade < 21) {
				contador1++;
			}
			else if (idade > 50) {
				contador2++;
			}
			
		System.out.println("Digite a idade (obs: para encerrar o programa digite -99): ");
		idade = leia.nextInt();
		}
		
		System.out.println("Pessoas com idade < 21 anos: " + contador1);
		System.out.println("Pessoas com idade > 50 anos: " + contador2);
		
		leia.close();

	}

}
