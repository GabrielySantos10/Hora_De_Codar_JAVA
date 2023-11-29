import java.util.Scanner;
public class Exerc10 {
    public static void main(String[] args){
        // Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro,
        // deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo.
        // O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int numero = entrada.nextInt();
        System.out.println("Digite o segundo valor:");
        int numero2 = entrada.nextInt();
        if ( numero2 > 0){
            System.out.println("A divisão do primeiro valor lido pelo segundo valor lido é:" + (numero / numero2));
        }
        else {
            while (numero2 <= 0 ) {
                System.out.println("Digite um valor maior que zero:");
                int new_numero = entrada.nextInt();
                if ( new_numero > 0) {
                    System.out.println("A divisão do primeiro valor lido pelo segundo valor lido é:" + (numero / new_numero));
                }
            }
        }
    }
}
