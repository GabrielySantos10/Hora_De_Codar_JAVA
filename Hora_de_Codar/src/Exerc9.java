import java.util.Scanner;
public class Exerc9 {
    public static void main(String[] args){
        // Faça um programa que leia 5  valores (considere que não serão informados valores iguais)
        // e escrever a soma dos 2 maiores.

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = entrada.nextInt();

        System.out.print("Digite o quarto número: ");
        int numero4 = entrada.nextInt();

        System.out.print("Digite o quinto número: ");
        int numero5 = entrada.nextInt();

        int maior;
        int menor;

        if (numero1 > numero2) {
            maior = numero1;
            menor = numero2;
        } else {
            maior = numero2;
            menor = numero1;
        }

        if (numero3 > maior) {
            menor = maior;
            maior = numero3;
        } else if (numero3 > menor) {
            menor = numero3;
        }

        if (numero4 > maior) {
            menor = maior;
            maior = numero4;
        } else if (numero4 > menor) {
            menor = numero4;
        }

        if (numero5 > maior) {
            menor = maior;
            maior = numero5;
        } else if (numero5 > menor) {
            menor = numero5;
        }
        int soma = maior + menor;
        System.out.println("A soma dos dois maiores números é: " + soma);
    }
}


