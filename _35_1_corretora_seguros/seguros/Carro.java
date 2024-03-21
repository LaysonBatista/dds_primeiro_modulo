package _35_corretora_seguros.seguros;

import _35_corretora_seguros.corretora.Seguravel;

public class Carro implements Seguravel {
    private String descricao;
    private Float valor;

    public Carro(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public void obterDescricao() {
        System.out.println("\nDescrição do veículo: " + this.descricao);
    }
    public void calcularValorApolice() {
        System.out.println("\nValor da apólice: R$" + this.valor * 0.005);  // 0.5%
    }

    @Override
    public void calcularSeguro() {
        System.out.println("\nValor do seguro: R$" + this.valor * 0.04);    // 4%
    }
}
