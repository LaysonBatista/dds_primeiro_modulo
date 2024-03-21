package _4_tipo_primitivo;

import java.util.Scanner;

public class numeroAoQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Quadrado do número
        int numeroQuadrado = numero * numero;
        System.out.println(numero + " x " + numero + " = " + numeroQuadrado);

        scanner.close();
    }
}
