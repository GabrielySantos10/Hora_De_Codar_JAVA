package Exerc4;

import java.util.Scanner;

public class paralelogramo {
    public static void main(String[] args){
        //  escreva um programa para calcular a área do Paralelogramo.
        //  O usuário irá informar os valores de cada variável.
        Scanner entrada = new Scanner(System.in);

        System.out.println("Para calcular a área do paralelogramo, precisamos do valor da base e da altura.");
        System.out.println("Insira o valor da base do paralelogramo:");

        int base = entrada.nextInt();

        System.out.println("Insira o valor da altura do paralelogramo:");

        int altura = entrada.nextInt();
        System.out.println("Paralelogramo: A= base * altura");
        System.out.println("A= " + (base * altura));
    }
}
