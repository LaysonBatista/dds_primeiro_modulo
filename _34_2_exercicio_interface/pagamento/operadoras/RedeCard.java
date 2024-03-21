package _11_exercises._47_1_exercicio_interface.pagamento.operadoras;

import _11_exercises._47_1_exercicio_interface.caixa.Compra;
import _11_exercises._47_1_exercicio_interface.pagamento.Autorizavel;
import _11_exercises._47_1_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_1_exercicio_interface.pagamento.Operadora;

public class RedeCard implements Autorizavel, Operadora {
    @Override
    public void autorizarCompra(Cartao cartao, Compra compra) {
        System.out.println("\n---------- AUTORIZAR COMPRA -----");

        if (compra.getValor() <= cartao.getLimiteCartao()) {
            System.out.println("Compra autorizada com SUCESSO!");
        } else {
            System.out.println("Compra RECUSADA! O valor está acima do limite permitido");
        }
    }

    @Override
    public void autorizarCartao(Cartao cartao, Compra compra) {
        System.out.println("\n---------- AUTORIZAR CARTÃO REDE CARD -----");

        if (cartao.getNumeroCartao() == 456) {
            cartao.setLimiteCartao(200f);
            System.out.println("Cartão aceito com SUCESSO!");
            autorizarCompra(cartao, compra);
        } else {
            System.err.println("Cartão RECUSADO!");
        }
    }
}
