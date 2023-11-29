import java.util.Scanner;
public class Exerc8 {
    public static void main(String[] args){
        // Faça um programa que leia  3 valores (considere que não serão informados valores iguais)
        // e escrever a soma dos 2 maiores.
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        int soma;

        if (numero > numero2 && numero > numero3) {

            if (numero2 > numero3) {
                soma = numero + numero2;
            } else {
                soma = numero + numero3;
            }
        } else if (numero2 > numero && numero2 > numero3) {

            if (numero > numero3) {
                soma = numero2 + numero;
            } else {
                soma = numero2 + numero3;
            }
        } else {

            if (numero > numero2) {
                soma = numero3 + numero;
            } else {
                soma = numero3 + numero2;
            }
        }
        System.out.println("A soma dos dois maiores números é: " + soma);
    }
}
