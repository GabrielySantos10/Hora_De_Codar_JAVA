import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome ");

        String nome = scanner.nextLine();

        System.out.print("Olá, " + nome);


    }
}
