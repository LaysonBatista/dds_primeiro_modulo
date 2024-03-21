package _34_produtos;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Produto produto = new Produto();
    Caixa caixa = new Caixa();

    cliente.cadastrarCliente(scanner);
    produto.cadastrarProduto(scanner);

    String opcaoUsuario = caixa.conferirCompra(scanner, produto, cliente);

    if (opcaoUsuario.equals("S") || opcaoUsuario.equals("s")) {
      System.out.println("\nCompra EFETUADA com sucesso!");
    } else if (opcaoUsuario.equals("N") || opcaoUsuario.equals("n")) {
      System.out.println("\nA compra foi CANCELADA!");
    } else {
      System.err.println("\nERRO na transação!");
    }
  }
}
