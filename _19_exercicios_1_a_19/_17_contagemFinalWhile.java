package _40_logica_6_4;

import java.util.Scanner;

public class contagemFinalWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o último valor da contagem: ");
        int valorFinal = entrada.nextInt();

        int i = 1;

        System.out.print("\nContagem:  ");

        while (i <= valorFinal) {
            System.out.print(i + "  ");

            if (i % 25 == 0) {
                System.out.print("\n");
            }

            i++;
        }
    }
}
