package _34_produtos;

import java.util.Scanner;

public class Produto {
  private String nome;
  private Float valor;
  private Integer quantidade;

  public void cadastrarProduto(Scanner scanner) {
    System.out.println("\n---------- CADASTRO DO PRODUTO ----------");
    System.out.print("\nInsira o nome do produto: ");
    this.nome = scanner.nextLine();

    System.out.print("Valor: ");
    this.valor = scanner.nextFloat();
    scanner.nextLine();

    System.out.print("Agora, a quantidade: ");
    this.quantidade = scanner.nextInt();
    scanner.nextLine();
  }

  public void descricaoProduto() {
    System.out.println("\n---------- DESCRICAO DO PRODUTO ----------");
    System.out.println("\nNome: " + this.nome
    + "\nValor: R$" + this.valor
    + "\nQuantidade em estoque: " + this.quantidade);
  }
}
