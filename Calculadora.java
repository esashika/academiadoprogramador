import java.util.Scanner;
public class Calculadora{
	
	public static void main(String[] args) {
		int operacaoSelecionada;
		int num1;
		int num2;

		Scanner teclado = new Scanner(System.in);
		
		do{
			mostraMenu();
			operacaoSelecionada = teclado.nextInt();
			if (operacaoSelecionada>=6) {
				System.out.println("Obrigado por utilizar nossa Calculadora");
			}else{
				System.out.println("Digite num1: ");
				num1 = teclado.nextInt();
				System.out.println("Digite num2: ");
				num2 = teclado.nextInt();
				operacoes(operacaoSelecionada,num1,num2);
			}

		}while(operacaoSelecionada<=5);

	}

	public static void mostraMenu(){
		System.out.println("----------------------------");
		System.out.println("Escolha uma das opções: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("5 - Potenciação");
		System.out.println("6 - Sair");

		System.out.println("----------------------------");
	}

	public static void adicao(int num1, int num2){
		int resultado;
		resultado = num1+num2;
		System.out.println("O resultado foi: " + resultado);
	}

	public static void subtracao(int num1, int num2){
		int resultado;
		resultado = num1-num2;
		System.out.println("O resultado foi: " + resultado);
	}
	public static void multiplicacao(int num1, int num2){
		int resultado;
		resultado = num1*num2;
		System.out.println("O resultado foi: " + resultado);
	}
	public static void divisao(int num1, int num2){
		int resultado;
		resultado = num1/num2;
		System.out.println("O resultado foi: " + resultado);
	}
	public static void potenciacao(int num1, int num2){
		// em construcao
	}

	public static void operacoes(int operacao, int num1, int num2){

		switch (operacao) {
			case 1:
			adicao(num1,num2);
			break;

			case 2:
			subtracao(num1,num2);
			break;

			case 3:
			multiplicacao(num1,num2);
			break;

			case 4:
			divisao(num1,num2);
			break;

			case 5:
			potenciacao(num1,num2);
			break;

			default:
			System.out.println("Número Inválido");
			break;


		}

	}
}