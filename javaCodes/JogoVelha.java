import java.util.Scanner;
public class JogoVelha{


    public static void main(String[] args){
    
    String[] velha = new String[9];
    resetaVetor(velha);
    imprimeVelha(velha);
        
    Scanner teclado = new Scanner(System.in);    
       
        boolean vitoriaGeral = false;
        int jogadaDaVez=0;
        int posicaoInseridaTeclado;
        int numeroDigitado;
        boolean resultadoEstaVazio;
        
        while (vitoriaGeral !=true){
        playerDaVez(jogadaDaVez);
        System.out.println("Diga a casa");
        numeroDigitado = teclado.nextInt();
        
        resultadoEstaVazio = estaVazio(velha, numeroDigitado);
            
        if(resultadoEstaVazio){
        jogarPlayer(velha, numeroDigitado,jogadaDaVez);
        
        }else{
        while(resultadoEstaVazio!=true){
            playerDaVez(jogadaDaVez);
            System.out.println("Já jogaram aqui insira Novamente");
            numeroDigitado = teclado.nextInt();
            resultadoEstaVazio = estaVazio(velha, numeroDigitado);
        }
         jogarPlayer(velha, numeroDigitado,jogadaDaVez);   
        }
            
        vitoriaGeral =  testarVitoriaX(velha);
        imprimeVelha(velha);
        jogadaDaVez++;
           
        }
        
    }
    
    
    
    public static void resetaVetor(String[] vetorPassado){
        for(int i = 0; i< vetorPassado.length; i++){
        vetorPassado[i] = "-";
        }
    }
    
    public static void imprimeVelha(String[] vetorPassado){
        for(int i = 0; i< vetorPassado.length; i++){
        System.out.println("casa" + i + vetorPassado[i]);
        }
        System.out.println("##############");
        
    }
    
    public static void jogarPlayer(String[] vetorPassado, int posicao, int jogadaDaVez){
        if(jogadaDaVez%2==0){
        vetorPassado[posicao] = "x";
        }else{
        vetorPassado[posicao] = "o";
        }
    }
    
    public static boolean estaVazio(String[] vetorPassado, int posicao){
 
 boolean resultadoEstaVazio;
        
       if(vetorPassado[posicao]=="-"){
       resultadoEstaVazio = true;
       }else{
       resultadoEstaVazio = false;
       }
        return resultadoEstaVazio;
    
    }

    public static boolean testarVitoriaX(String[] vetorPassado){
    
        String simboloJogador= "x";
        boolean vitoria;
        boolean resultadoVelhou = verificarSeVelhou(vetorPassado);
        
        
       if (resultadoVelhou){
        System.out.println("Velhou Mano");
       vitoria = true;
       }else if (vetorPassado[0] ==simboloJogador  && vetorPassado[1] ==simboloJogador && vetorPassado[2] ==simboloJogador){
       vitoria = true;
       }else if (vetorPassado[3] ==simboloJogador  && vetorPassado[4] ==simboloJogador && vetorPassado[5] ==simboloJogador){
       vitoria = true;
       }else if (vetorPassado[6] ==simboloJogador  && vetorPassado[7] ==simboloJogador && vetorPassado[8] ==simboloJogador){
       vitoria = true;
       }else{
       vitoria = false;
       }
    return vitoria;
    }

public static void playerDaVez(int jogadaDaVez){
        if(jogadaDaVez%2==0){
        System.out.println("Vez do Player X");
        }else{
        System.out.println("Vez do Player 0");
        }

}
 
    public static boolean verificarSeVelhou(String[] vetorPassado){
    
        int traco = 0;
        boolean velhou;
        
        for(int i = 0; i< vetorPassado.length; i++){
        if(vetorPassado[i]=="-"){
        traco++;
        }
                                }
    
            if(traco==0){
            velhou=true;
            }else{
            velhou=false;
            }
        
        
    return velhou;
}

}