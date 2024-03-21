package _35_corretora_seguros.teste;

import _35_corretora_seguros.corretora.CorretoraSeguros;
import _35_corretora_seguros.corretora.Seguravel;
import _35_corretora_seguros.seguros.Carro;
import _35_corretora_seguros.seguros.Imovel;

public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros corretoraSeguros = new CorretoraSeguros();
        Seguravel objeto1 = new Carro("Honda City da cor prata, do ano de 2018.", 59854.53f);
        Seguravel objeto2 = new Imovel(368200.25f);
        
        corretoraSeguros.fazerPropostaSeguro(objeto1);
        corretoraSeguros.fazerPropostaSeguro(objeto2);
    }
}
