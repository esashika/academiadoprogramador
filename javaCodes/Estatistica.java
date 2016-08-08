/* Dado o Seguinte Vetor numeros = { 6, 9, 15, -2, 92, 11}, extraia as seguintes informações;
- Maior Valor.
- Menor Valor.
- Quantidade de Elementos (através do método da classe).
- Media.
- Soma*/
public class Estatistica{
	
	public static void main(String[] args) {
		
	int [] numeros = { 6, 9, 15, -2, 92, 11};
        int menorValor = numeros [0];
        int maiorValor = numeros [0];
        int numeroDeElementos=0;
        float media =0;
        float soma =0;
		
    		for (int i = 0; i < numeros.length; i++ ){
            	if (numeros [i]<menorValor) {
            		menorValor = numeros [i];	
              	}
            }
    	
    	System.out.println("\nMenor Valor : \n" + menorValor);

            for (int i = 0; i < numeros.length; i++){
     			if(numeros [i]>maiorValor){
     				maiorValor = numeros [i];
                }
            }
				
		System.out.println( "\nMaior valor \n: "+ maiorValor);
        
            numeroDeElementos = numeros.length; 

            for (int i =0; i<numeros.length; i++) {
            	soma = soma + numeros[i];
            }
        
        System.out.println("Media: " + soma/numeroDeElementos);

        System.out.println("Numero de elementos :" + numeroDeElementos);
	}


}
