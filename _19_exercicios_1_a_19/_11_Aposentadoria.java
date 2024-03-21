package _25_logica_4_6;

import java.util.Scanner;

public class Aposentadoria3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\"Aposentadoria\"\n");
        System.out.print("Informe sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Agora, informe seu tempo de contribuição com a previdência: ");
        int tempoPrevidencia = entrada.nextInt();

        System.out.println("\n");

        boolean condicaoAposentadoria = idade >= 55 && tempoPrevidencia >= 25;

        System.out.print(condicaoAposentadoria ? "Sim! Você pode se aposentar." : "Não! Você ainda não pode se aposentar.");

        entrada.close();
    }
}
