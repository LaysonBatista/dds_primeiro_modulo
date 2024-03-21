package _11_exercises._47_2_exercicio_interface.teste;

import _11_exercises._47_2_exercicio_interface.caixa.Checkout;
import _11_exercises._47_2_exercicio_interface.caixa.Compra;
import _11_exercises._47_2_exercicio_interface.impressao.Impressora;
import _11_exercises._47_2_exercicio_interface.impressao.impressoras.ImpressoraHP;
import _11_exercises._47_2_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_2_exercicio_interface.pagamento.Operadora;
import _11_exercises._47_2_exercicio_interface.pagamento.operadoras.RedeCard;

public class TesteCheckout {
    public static void main(String[] args) {
        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("456");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(99);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
}
