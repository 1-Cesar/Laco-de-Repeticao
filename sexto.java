package br.com.generation.exercicios;

import java.util.Scanner;

public class sexto {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		float num = 0, media = 0, contador=0, impar = 0;
		
		do {
			
			System.out.println("Digite um número (obs: para finalizar digite 0): ");	
				num = leia.nextFloat();
			
			if (num % 3 == 0 && num != 0) {
				contador++;
				impar = impar + num;
			}
		} while (num != 0);
		
		media = impar / contador;
		
		if (media > 0) {
		System.out.println("Média dos números múltiplos de 3: " + media);
		}
		else {
			System.out.println("Nenhum multiplo de 3 localizado");
		}
		
	}

}
