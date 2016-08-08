/*
Finalidade: Estabelecer o número mínimo de cédulas que serão disponibilizadas, de acordo com o valor do saque
Autor: Luciano Borges
Data: 23/07/2016
*/

import java.util.Scanner;

public class CaixaEletronico2{
	public static void main(String[] args) {
		
		int valorSaque = 0, notas100 = 0, notas50 = 0, notas20 = 0, notas10 = 0, temporario = 0;

		Scanner teclado = new Scanner(System.in);

		
		do {
			System.out.print("Digite o valor do saque: ");
			valorSaque = teclado.nextInt();
  			if (valorSaque%10!=0) {	
  				System.out.println("Valor Invalido. Tente novamente.");	
  			}
		} while (valorSaque%10!=0);
		
		
		notas100 = valorSaque/100;
		temporario = valorSaque%100;
		notas50 = temporario/50;
		temporario = temporario%50;
		notas20 = temporario/20;
		temporario = temporario%20;
		notas10 = temporario/10;

		System.out.println("Notas de 100: " +notas100);
		System.out.println("Notas de 50: " +notas50);
		System.out.println("Notas de 20: " +notas20);
		System.out.println("Notas de 10: " +notas10);

	}
}
