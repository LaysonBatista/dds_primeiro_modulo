package _34_logica_5_6;

import java.util.Scanner;

public class DiasSemanais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\"Dias Semanais\"\n");

        System.out.print("Informe o dia da semana [1-7]: ");
        int valorEscolhido = entrada.nextInt();

        String diaSemanal = "";

        switch (valorEscolhido) {
            case 1:
                diaSemanal = "domingo";
                break;
            case 2:
                diaSemanal = "segunda-feira";
                break;
            case 3:
                diaSemanal = "terça-feira";
                break;
            case 4:
                diaSemanal = "quarta-feira";
                break;
            case 5:
                diaSemanal = "quinta-feira";
                break;
            case 6:
                diaSemanal = "sexta-feira";
                break;
            case 7:
                diaSemanal = "sábado";
                break;
            default:
                System.err.print("Valor inválido!");
                System.exit(1);
        }

        System.out.print("Dia da semana: " + diaSemanal);
    }
}
