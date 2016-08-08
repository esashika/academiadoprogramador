/*
Desenvolva um programa que simule a entrega de notas quando um cliente efetuar um saque em um caixa eletrônico. Os requisitos básicos são os seguintes:
Entregar o menor número de notas;
É possível sacar o valor solicitado com as notas disponíveis;
Saldo do cliente infinito;
Quantidade de notas infinito (pode-se colocar um valor finito de cédulas para aumentar a dificuldade do problema);
Notas disponíveis de R$ 100,00; R$ 50,00; R$ 20,00 e R$ 10,00
Exemplos:
Valor do Saque: R$ 30,00 – Resultado Esperado: Entregar 1 nota de R$20,00 e 1 nota de R$ 10,00.
Valor do Saque: R$ 80,00 – Resultado Esperado: Entregar 1 nota de R$50,00 1 nota de R$ 20,00 e 1 nota de R$ 10,00.
Data: 23/07/2016
*/
import java.util.Scanner;
public class CaixaEletronico{

	public static void main(String[] args) {
		
		int valorDoSaque;
		Scanner teclado = new Scanner(System.in);
		

		int notas100 = 0;
		int notas50 = 0;
		int notas20 = 0;
		int notas10 = 0;

		do{
			System.out.println("Digite o valor do Saque");
			valorDoSaque = teclado.nextInt();
				if (valorDoSaque%10!=0) {
					System.out.println("Valor inválido");
				}
		}while(valorDoSaque%10!=0);


		while(valorDoSaque!=0){
			if (valorDoSaque>=100){
				valorDoSaque-=100;
				notas100++;
			}else if (valorDoSaque>=50 && valorDoSaque<100) {
				valorDoSaque-=50;
				notas50++;
			}else if (valorDoSaque>=20 && valorDoSaque<50) {
				valorDoSaque-=20;
				notas20++;
			}else if (valorDoSaque>=10 && valorDoSaque<20) {
				valorDoSaque-=10;
				notas10++;
			}
		}

		System.out.println("Notas 100: " + notas100);
		System.out.println("Notas 50: " + notas50);
		System.out.println("Notas 20: " + notas20);
		System.out.println("Notas 10: " + notas10);
	}

}
