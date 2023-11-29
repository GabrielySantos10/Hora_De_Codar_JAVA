import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 0;

        String resposta;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = entrada.next();

            System.out.print("Digite a nota 1: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Digite a nota 2: ");
            double nota2 = entrada.nextDouble();

            System.out.print("Digite a nota 3: ");
            double nota3 = entrada.nextDouble();

            System.out.print("Digite a nota 4: ");
            double nota4 = entrada.nextDouble();

            System.out.print("Digite a nota 5: ");
            double nota5 = entrada.nextDouble();

            System.out.print("Digite a nota 6: ");
            double nota6 = entrada.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6) / 6.0;

            if (media >= 6.5) {
                System.out.printf("%.1f\n", media);
                System.out.println(nome + " aprovado!");
                contador++;
            } else  {
                System.out.println(nome + " em recuperação");
            }

            System.out.println("Calcular a média de outro aluno Sim/Não?");
            resposta = entrada.next();
        } while (resposta.equalsIgnoreCase("S") || resposta.equalsIgnoreCase("Sim") || resposta.equalsIgnoreCase("sim"));

        System.out.println("Total de alunos aprovados: " + contador);
    }
}
