package _34_produtos;

import java.util.Scanner;

public class Cliente {
  private String nome;
  private String CPF;

  public void cadastrarCliente(Scanner scanner) {
    System.out.println("\n---------- CADASTRO DE CLIENTE ----------");
    System.out.print("\nInsira o nome: ");
    this.nome = scanner.nextLine();

    System.out.print("Agora, o CPF: ");
    this.CPF = scanner.next();
    scanner.nextLine();
  }

  public void descricaoCliente() {
    System.out.println("\n---------- CLIENTE ----------");
    System.out.println("\nNome: " + this.nome
    + "\nCPF: " + this.CPF);
  }
}
