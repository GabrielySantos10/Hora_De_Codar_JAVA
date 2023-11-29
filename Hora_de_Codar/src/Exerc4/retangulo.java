package Exerc4;

import java.util.Scanner;

public class retangulo
{
    public static void main(String[] args) {
        //  escreva um programa para calcular a área do retângulo.
        //  O usuário irá informar os valores de cada variável.


        // Retângulo
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular a área do retângulo, precisamos do valor da base e da altura.");
        System.out.println("Insira o valor da base do retângulo:");

        int base = entrada.nextInt();

        System.out.println("Insira o valor da altura do retângulo:");

        int altura = entrada.nextInt();
        System.out.println("Retângulo: A= base * altura");
        System.out.println("A= " + (base * altura));
    }
}
