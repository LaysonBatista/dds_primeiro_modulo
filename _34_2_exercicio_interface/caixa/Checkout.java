package _11_exercises._47_1_exercicio_interface.caixa;

import _11_exercises._47_1_exercicio_interface.impressao.Impressora;
import _11_exercises._47_1_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_1_exercicio_interface.pagamento.Operadora;

public class Checkout {
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Cartao cartao, Compra compra) {
        this.operadora.autorizarCartao(cartao, compra);
        compra.comprovante(compra, this.impressora);
    }
}
