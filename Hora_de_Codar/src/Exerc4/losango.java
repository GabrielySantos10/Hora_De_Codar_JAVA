package Exerc4;

import java.util.Scanner;

public class losango {
    public static void main (String[] args){
        //  escreva um programa para calcular a área do losango.
        //  O usuário irá informar os valores de cada variável.


        // Losango
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para calcular a área do losango, precisamos do valor da diagonal maior e da diagonal menor.");

        System.out.println("Insira o valor da diagonal maior:");
        int d_maior = entrada.nextInt();

        System.out.println("Insira o valor da diagonal menor:");
        int d_menor = entrada.nextInt();

        System.out.println("Losango: A= (diagonal maior * diagonal menor )/ 2");
        System.out.println("A= " + (d_maior * d_menor)/2);

    }
}
