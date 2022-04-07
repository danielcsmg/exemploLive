public class ex001 {
    public static void main(String[] args) {
        quatroOperacoes(10, 5);
    }
    public static void quatroOperacoes(int num1, int num2) {
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int divi = num1 / num2;
        
        System.out.println("A soma é: "+soma);
        System.out.println("A subtraçao é: "+sub);
        System.out.println("A multipllicação é: "+mult);
        System.out.println("A divisão é: "+divi);
    }
}
