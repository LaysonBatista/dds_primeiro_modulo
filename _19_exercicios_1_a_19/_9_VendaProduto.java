package _16_java_2;

import java.util.Scanner;

public class VendaProduto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("\"Venda de Produtos\"\n");

        System.out.print("Digite o valor do produto: ");
        float valorProduto = (float) entrada.nextFloat();

        System.out.print("Agora, informe a quantidade desejada: ");
        int quantidadeProduto = entrada.nextInt();

        float subtotal = valorProduto * quantidadeProduto;
        float valorDesconto = (float) (subtotal - (subtotal * 0.10);

        System.out.println((quantidadeProduto > 10) ? "Valor total com 10% de desconto: " + valorDesconto : "Valor total: " + subtotal);
    }
}
