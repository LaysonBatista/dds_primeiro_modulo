package _35_corretora_seguros.seguros;

import _35_corretora_seguros.corretora.Seguravel;

public class Imovel implements Seguravel {
    private Float valor;

    public Imovel(Float valor) { this.valor = valor; }

    @Override
    public void calcularSeguro() {
        System.out.println("\nValor do seguro: R$" + this.valor * 0.06);    // 6%
    }
}
