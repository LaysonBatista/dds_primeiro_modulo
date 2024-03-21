package _10_java_2;

import java.util.Scanner;

public class OperadoresComparacaoIgualdade {
    public static void main(String[] args) {
        // Comparação: maior (>); menor (<); maior ou igual (>=); menor ou igual (<=).
        // Igualdade: igual (==); diferente (!=).

        int a = 10;
        int b = 5;
        int c = 2;

        System.out.println("\"Comparação e Igualdade\"\n");

        boolean maior = b > a;
        System.out.println("b > a: " + maior);

        boolean maiorIgual = b >= a;
        System.out.println("b >= a: " + maiorIgual);

        boolean menor = a < b;
        System.out.println("a < b: " + menor);

        boolean menorIgual = a <= 10;
        System.out.println("a <= b: " + menorIgual);

        boolean igual = a == (b - c);
        System.out.println("a == (b - c): " + igual);

        boolean diferente = a != c;
        System.out.println("a != c: " + diferente);

        String separador = "---------------------------------------\n";
        System.out.println(separador);

        boolean bloqueado = false;
        System.out.println("Bloqueado: " + bloqueado);

        bloqueado = !bloqueado;
        System.out.println("Bloqueado: " + bloqueado);
    }
}
