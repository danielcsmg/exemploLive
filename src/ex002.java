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

        int[] vetorOrganizado = organizaValores(vetorA);

        System.out.println("Seu vetor está organizado.");
        for(int i = 0; i < vetorOrganizado.length; i++){
            System.out.println("Na posição " + i + ": " + vetorOrganizado[i]);
        }
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

    public static int[] organizaValores(int[] vetor){
        int trocador = 0;
        for(int i = 0; i < vetor.length; i++){
            for(int j = i; j < vetor.length;j++){
                if(vetor[i] > vetor[j]){
                    trocador = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = trocador;
                }
            }
        }
        return vetor;
    }
}
