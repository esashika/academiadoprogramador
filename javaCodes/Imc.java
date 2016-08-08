import java.util.Scanner;
public class Imc{
	//pag 139
	public static void main(String[] args) {
		float peso;
		float altura;
		int sexo;
		float imcCalculado;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite seu peso: Ex: 89,6");
			peso = teclado.nextFloat();
			
			System.out.println("Digite sua altura: Ex 1,72");
			altura = teclado.nextFloat();
			
			System.out.println("Seu sexo: \n1-Masculino \n2-Feminino");
			sexo = teclado.nextInt();
			imcCalculado = calcularImc(peso,altura);

		switch(sexo){
			case 1:
			System.out.println("Voce esta " + imcHomem(imcCalculado));
			break;

			case 2:
			System.out.println("Voce esta " + imcMulher(imcCalculado));
			break;
		}
	}

	public static float calcularImc(float pesoP, float alturaP){
		float resultadoImc = pesoP / (alturaP * alturaP);
		return resultadoImc;
	}

	public static String imcHomem(float imcP){
		String mensagem = null;
		if (imcP<20.7) {
			mensagem = "Abaixo do peso";
		}else if (imcP>=20.7 && imcP<26.4) {
			mensagem = "No peso ideal";
		}else if (imcP>=26.4 && imcP<27.8) {
			mensagem = "Marginalmente acima do peso";
		}else if (imcP>=27.8 && imcP<31.1) {
			mensagem = "acima do peso ideal";
		}else if (imcP>=31.1) {
			mensagem = "Obeso";
		}
		return mensagem;
	}


	public static String imcMulher(float imcP){
		String mensagem="";
			if (imcP<19.1) {
				mensagem = "Abaixo do peso";
			}else if (imcP>=19.1 && imcP<25.8) {
				mensagem = "No peso ideal";
			}else if (imcP>=25.8 && imcP<27.3) {
				mensagem = "Marginalmente acima do peso";
			}else if (imcP>=27.3 && imcP<32.3) {
				mensagem = "acima do peso ideal";
			}else if (imcP>=32.3) {
				mensagem = "Obeso";
			}
		return mensagem;
	}
}
