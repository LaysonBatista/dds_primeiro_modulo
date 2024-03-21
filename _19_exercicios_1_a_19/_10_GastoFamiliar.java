package _25_logica_4_6;

import java.util.Scanner;

public class GastoFamiliar2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float somaTotalGastos = 0.0F;

        System.out.println("Informe os valores gastos com...\n");
        System.out.print("Conta de luz: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.print("Conta de água: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.print("Conta de telefone: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.print("Escola do filho: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.print("Fatura do cartão: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.print("Gasto no supermercado: ");
        somaTotalGastos += entrada.nextFloat();

        System.out.println("\nGasto total: R$" + somaTotalGastos);

        entrada.close();
    }
}
