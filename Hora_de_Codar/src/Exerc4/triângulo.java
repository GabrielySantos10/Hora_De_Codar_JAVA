package Exerc4;

import java.util.Scanner;

public class triângulo {
    public static void main(String[] args){
        //  escreva um programa para calcular a área do Triângulo.
        //  O usuário irá informar os valores de cada variável.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular a área do triângulo, precisamos do valor da base e da altura.");
        System.out.println("Insira o valor da base do triângulo:");

        int base = entrada.nextInt();

        System.out.println("Insira o valor da altura do triângulo:");

        int altura = entrada.nextInt();
        System.out.println("triângulo: A= base * altura / 2");
        System.out.println("A= " + (base * altura) / 2);
    }
}