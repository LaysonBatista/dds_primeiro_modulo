package _34_produtos;

import java.util.Scanner;

public class Caixa implements Compravel {
  @Override
  public String conferirCompra(Scanner scanner, Produto produto, Cliente cliente) {
    cliente.descricaoCliente();
    produto.descricaoProduto();

    System.out.println("\n---------- CAIXA ----------");
    System.out.println("\nConfirmar compra [S/N]: ");
    System.out.print("Opção: ");

    return scanner.next();
  }
}
