package _11_exercises._39_FilBank;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta1 = new Conta();

        System.out.println("\n\"FillBank\"");
        System.out.println("\n-------------------------");

        System.out.println("Informe o tipo de conta: \n[1] Corrente \n[2] Poupança \n[3] Simples");
        System.out.print("\nOpção: ");
        Integer tipoContaUsuario = sc.nextInt();
        sc.nextLine();

        System.out.println("\n-------------------------");
        System.out.print("Saldo: ");
        conta1.setSaldo(sc.nextFloat());

        if (tipoContaUsuario == 1) {
            conta1.imprimirConta(TipoConta.CORRENTE);
        } else if (tipoContaUsuario == 2) {
            conta1.imprimirConta(TipoConta.POUPANCA);
        } else {
            conta1.imprimirConta(TipoConta.SIMPLES);
        }
    }
}
