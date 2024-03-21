package _11_exercises._19_atacadao;

import java.util.Scanner;

public class Estoque_23_3 {
    Produto_23_2[] produtos;

    public void listarEDescreverProdutos(Scanner sc) {
        int i;
        for (i = 0; i < produtos.length; i++) {
            Produto_23_2 produto = produtos[i];
            System.out.println("[" + (i + 1) + "] " + produto.getNome());
        }

        System.out.print("\nOpção: ");
        int opcaoUsuario = sc.nextInt();

        produtos[opcaoUsuario - 1].descrever();
    }
}
