package Exerc4;

import java.util.Scanner;

public class quadrado {
    public static void main (String[] args){
        //  escreva um programa para calcular a área do quadrado.
        //  O usuário irá informar os valores de cada variável.


        // Quadrado
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para calcular a área do quadrado, precisamos do valor do lado.");

        System.out.println("Insira o valor do lado do quadrado:");
        int lado = entrada.nextInt();

        System.out.println("Quadrado: A= lado * lado");
        System.out.println("A= " + (lado * lado));

    }
}

