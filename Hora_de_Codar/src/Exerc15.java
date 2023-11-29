import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args){

        // Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e
        // todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int i = entrada.nextInt();
        System.out.println("Digite o segundo número:");
        int u =entrada.nextInt();
        for (i = i + 1; i < u; i++){
            System.out.println(i);
        }
    }
}
