package _11_java_2;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\"Calcular IMC\"\n");

        System.out.print("Nome: ");
        String nome = entrada.nextLine();

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("\nIMC de " + nome + ": " + imc);

        boolean abaixoPeso = imc < 18.5;
        boolean pesoIdeal = imc < 25;
        boolean acimaPeso = imc < 30;
        boolean obesidade2 = imc < 40;

        if (abaixoPeso) {
            System.out.println("Abaixo do peso ideal.");
        } else if (pesoIdeal) {
            System.out.println("Peso ideal.");
        } else if (acimaPeso) {
            System.out.println("Acima do peso.");
        } else if (obesidade2) {
            System.out.println("Obesidade grau 2.");
        } else {
            System.out.println("Obesidade grau 3. Cuidado com seu peso!");
        }
    }
}
