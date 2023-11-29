public class Exerc17 {
    public static void main(String[] args){
        // Anacleto tem 1,50 metro e cresce 2 centímetros por ano, enquanto Felisberto tem 1,1O metro e cresce 3 centímetros por ano.
        // Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Felisberto seja maior que Anacleto.

            double alturaAnacleto = 1.50;
            double crescimento = 0.02;

            double alturaFelisberto = 1.10;
            double crescimento2 = 0.03;

            int anos = 0;

            while (alturaFelisberto <= alturaAnacleto) {
                alturaAnacleto += crescimento;
                alturaFelisberto += crescimento2;
                anos++;
            }

            System.out.println("Serão necessários " + anos + " anos para Felisberto ser maior que Anacleto.");
        }
    }
