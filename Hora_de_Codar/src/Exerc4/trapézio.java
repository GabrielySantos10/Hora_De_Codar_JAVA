package Exerc4;

import java.util.Scanner;

public class trapézio {
    public static void main (String[] args){
        //  escreva um programa para calcular a área do trapézio.
        //  O usuário irá informar os valores de cada variável.

        // Trapézio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para calcular a área do trapézio, precisamos do valor da base maior, da base menor e da altura.");

        System.out.println("Insira o valor da base maior:");
        int b_maior =entrada.nextInt();

        System.out.println("Insira o valor da base menor");
        int b_menor = entrada.nextInt();

        System.out.println("Insira o valor da altura");
        int h = entrada.nextInt();

        System.out.println("Trapézio: A= (base maior + base menor )* h / 2");
        System.out.println("A= " +( b_maior + b_menor) * h /2);


    }
}
