package _35_corretora_seguros.corretora;

import _35_corretora_seguros.seguros.Carro;
import _35_corretora_seguros.seguros.Imovel;

public class CorretoraSeguros {
    public void fazerPropostaSeguro(Seguravel objetoSeguravel) {
        System.out.println("\n---------- PROPOSTA SEGURADORA ----------");
        
        if (objetoSeguravel instanceof Carro) {
            objetoSeguravel = (Carro) objetoSeguravel;  // Gostaria de puxar o método do tipo Carro
            objetoSeguravel.calcularSeguro();
        } else if (objetoSeguravel instanceof Imovel) {
            objetoSeguravel.calcularSeguro();
        } else {
            System.err.println("\nTipo de objeto segurável não identificado!");
        }
    }
}
