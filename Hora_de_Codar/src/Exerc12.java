import java.util.Scanner;
public class Exerc12 {
    public static void main(String[] args) {
        //Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever
        // a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado!
        // somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4.0;
        if (media >= 6) {
            System.out.printf("%.1f\n", media);
            System.out.println(" PARABÉNS! Você foi aprovado!");
        }
        else {
            System.out.println("Recuperação");
        }

    }
}
