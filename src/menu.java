import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numDigitado = leitor.nextInt();

        int resposta = somatorio(numDigitado);
        System.out.println("Somatório: " + resposta);


        int dobro = dobrar(numDigitado);
        System.out.println("Dobro: " + dobro);
    }

    public static int somatorio(int n) {
        int soma = 0;
        for(int i = 0; i <= n; i++){
            soma += i;
        }

        return soma;
    }

    public static int dobrar(int n){
        n = n * 2;

        return n;
    }
}
