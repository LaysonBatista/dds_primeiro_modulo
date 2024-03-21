package _11_exercises._43_desafio_4_2;

public class RelatorioContas {
    public void exibirListagem(Conta[] contas) {
        System.out.println("------------------------------");
        System.out.println("\nRelatório de Contas a Pagar e Receber");
        System.out.println("------------------------------");

        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }
    }
}
