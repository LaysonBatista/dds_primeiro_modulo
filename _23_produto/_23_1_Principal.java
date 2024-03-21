package _11_exercises._19_atacadao;

import java.util.Scanner;

public class Principal_23_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        quebrarLinha();
        System.out.println("\"Criar Produtos\"");

        Produto_23_2 produto1 = new Produto_23_2();
        definirProduto(produto1, sc);

        Produto_23_2 produto2 = new Produto_23_2();
        definirProduto(produto2, sc);

        Estoque_23_3 estoque = new Estoque_23_3();
        estoque.produtos = new Produto_23_2[] { produto1, produto2 };

        quebrarLinha();
        System.out.println("--------------------");
        System.out.println("\"Produtos Disponíveis\"");

        quebrarLinha();
        estoque.listarEDescreverProdutos(sc);
    }

    private static void quebrarLinha() {
        System.out.print("\n");
    }

    private static void definirProduto(Produto_23_2 produto, Scanner sc) {
        quebrarLinha();
        System.out.println("-------------------------");
        System.out.print("Nome: ");
        produto.setNome(sc.next());

        System.out.print("Descrição: ");
        produto.setDescricao(sc.next());

        System.out.print("Quantidade: ");
        produto.setQuantidade(sc.nextInt());
    }
}
