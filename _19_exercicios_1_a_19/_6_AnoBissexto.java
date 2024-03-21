package _3_exercises;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\"Mostrar Ano Bissexto\"");

        System.out.print("\nDigite um ano: ");
        short ano = sc.nextShort();

        boolean anoBissexto = ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0;

        if(anoBissexto) {
            System.out.printf("O ano %s e bissexto!", ano);
        } else {
            System.out.printf("O ano %s nao e bissexto!", ano);
        }
    }
}
