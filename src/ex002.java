import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] vetorA = new int[7];
        
        for(int i = 0 ; i < vetorA.length ; i++){
            System.out.println("Digite valores para a posicao: " +i);
            vetorA[i] = leitor.nextInt();
        }
        int menor = menorValor(vetorA);

        System.out.println("Se é o menor valor que vc quer, entao recebaaaa "+menor);
    }

    
    public static int menorValor(int[] vetorP){
        int numMenor = vetorP[0];
        for(int i = 0 ; i < vetorP.length; i++){
            if(numMenor > vetorP[i]){
                numMenor = vetorP[i];

            }
        }
        return numMenor;
    }
}
