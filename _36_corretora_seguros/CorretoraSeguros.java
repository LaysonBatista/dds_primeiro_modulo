package _11_exercises._48_corretora_seguros;

public class CorretoraSeguros {
    public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
        System.out.println("\n------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("------------------------------\n");
    }
}
