package _11_exercises._9_metodos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo carro = new Veiculo();

        cadastroVeiculo(sc, carro);
        cadastroProprietario(sc, carro);
        registroVeicular(sc, carro);

        sc.close();
    }

    private static void cadastroVeiculo(Scanner sc, Veiculo veiculo) {
        System.out.println("\n\"Cadastro de Veículo\"");
        System.out.print("\nFabricante: ");
        veiculo.setFabricante(sc.next());

        System.out.print("Modelo: ");
        veiculo.setModelo(sc.next());

        System.out.print("Cor: ");
        veiculo.setCor(sc.next());

        System.out.print("Ano Fabricação: ");
        veiculo.setAnoFabricacao(sc.nextInt());
    }

    private static void cadastroProprietario(Scanner sc, Veiculo veiculo) {
        System.out.println("\n\"Cadastro de Proprietário\"");
        System.out.print("\nNome: ");
        veiculo.dono.setNome(sc.next());

        System.out.print("CPF: ");
        veiculo.dono.setCpf(sc.next());

        System.out.print("CEP: ");
        veiculo.dono.setCep(sc.next());

        System.out.print("Idade: ");
        veiculo.dono.setIdade(sc.nextInt());
    }

    private static void registroVeicular(Scanner sc, Veiculo veiculo) {
        int opcaoUsuario;

        do {
            System.out.println("\n[1] Registro do veículo \n[2] Dados do proprietário \n[3] Ligar veículo \n[4] Sair");
            System.out.print("\nOpção: ");
            opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {
                case 1:
                    System.out.println("\n\"Registro do Veículo\"");
                    System.out.println("\nFabricante: " + veiculo.getFabricante()
                            + "\nModelo: " + veiculo.getModelo()
                            + "\nCor: " + veiculo.getCor()
                            + "\nAno de Fabricação: " + veiculo.getAnoFabricacao());
                    break;
                case 2:
                    System.out.println("\n\"Dados do Proprietário\"");
                    System.out.println("\nNome: " + veiculo.dono.getNome()
                            + "\nCPF: " + veiculo.dono.getCpf()
                            + "\nCEP: " + veiculo.dono.getCep()
                            + "\nIdade: " + veiculo.dono.getIdade());
                    break;
                case 3:
                    System.out.println("\n\"Ligar Veículo\"\n");
                    veiculo.ligar();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.err.println("\nOpção inválida!");
            }
        } while (opcaoUsuario != 4);
    }
}
