package _11_exercises._23_ar_condicionado;

import java.util.Scanner;

public class ArCondicionado_24_1 {
    // Muda a temperatura do ar (25 - 17); Temperatura atual.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcaoUsuario = 0, temperaturaDesejada;

        System.out.println("\n\"Sistema do Ar Condicionado\"");
        System.out.print("\nDefina a temperatura do ar condicionado: ");
        temperaturaDesejada = sc.nextInt();
        sc.nextLine();

        Comportamento_24_2 temperatura = new Comportamento_24_2(temperaturaDesejada);

        while (opcaoUsuario != 3) {
            System.out.println("-------------------------");
            System.out.println("\n[1] Exibir temperatura atual \n[2] Mudar temperatura \n[3] Sair do sistema");
            System.out.print("\nOpção: ");
            opcaoUsuario = sc.nextInt();
            sc.nextLine();

            switch (opcaoUsuario) {
                case 1:
                    temperatura.exibirTemperaturaAtual();
                    break;
                case 2:
                    System.out.print("\nDefina a temperatura do ar condicionado: ");
                    temperaturaDesejada = sc.nextInt();
                    sc.nextLine();

                    temperatura = new Comportamento_24_2(temperaturaDesejada);
                    break;
                case 3:
                    break;
                default:
                    System.err.println("\nValor inválido!");
            }

        }

        System.out.println("\nFinalizando sistema...");
        sc.close();
    }
}
