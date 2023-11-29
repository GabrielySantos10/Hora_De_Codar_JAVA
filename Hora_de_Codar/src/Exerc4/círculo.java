package Exerc4;

import java.util.Scanner;

public class círculo {
    public static void main(String[] args){
        //  escreva um programa para calcular a área do Círculo.
        //  O usuário irá informar os valores de cada variável.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular a área do círculo, precisamos do valor do raio.");

        System.out.println("Insira o valor do raio do círculo:");

        int r = entrada.nextInt();
        System.out.println("Círculo: A= π.r²");
        System.out.println("A= " + ( 3.14 * r * r));
    }
}