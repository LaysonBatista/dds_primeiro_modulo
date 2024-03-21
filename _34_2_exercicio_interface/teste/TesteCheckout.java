package _11_exercises._47_1_exercicio_interface.teste;

import _11_exercises._47_1_exercicio_interface.caixa.Checkout;
import _11_exercises._47_1_exercicio_interface.caixa.Compra;
import _11_exercises._47_1_exercicio_interface.impressao.Impressora;
import _11_exercises._47_1_exercicio_interface.impressao.impressoras.ImpressoraEpson;
import _11_exercises._47_1_exercicio_interface.impressao.impressoras.ImpressoraHP;
import _11_exercises._47_1_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_1_exercicio_interface.pagamento.Operadora;
import _11_exercises._47_1_exercicio_interface.pagamento.operadoras.Cielo;
import _11_exercises._47_1_exercicio_interface.pagamento.operadoras.RedeCard;

public class TesteCheckout {
    public static void main(String[] args) {
        System.out.println("\n=============== TESTE 1 ===============");

        Operadora cielo = new Cielo();
        Impressora epson = new ImpressoraEpson();
        Cartao cartaoTeste1 = new Cartao(123);
        Compra compraTeste1 = new Compra("Picanha", 70f);

        Checkout teste1 = new Checkout(cielo, epson);
        teste1.fecharCompra(cartaoTeste1, compraTeste1);

        System.out.println("\n=============== TESTE 2 ===============");

        Operadora redeCard = new RedeCard();
        Impressora hp = new ImpressoraHP();
        Cartao cartaoTeste2 = new Cartao(456);
        Compra compraTeste2 = new Compra("Headset", 120f);

        Checkout teste2 = new Checkout(redeCard, hp);
        teste2.fecharCompra(cartaoTeste2, compraTeste2);
    }
}
