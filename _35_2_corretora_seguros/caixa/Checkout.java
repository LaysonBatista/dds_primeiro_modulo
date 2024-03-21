package _11_exercises._47_2_exercicio_interface.caixa;

import _11_exercises._47_2_exercicio_interface.impressao.Impressora;
import _11_exercises._47_2_exercicio_interface.pagamento.Cartao;
import _11_exercises._47_2_exercicio_interface.pagamento.Operadora;

public class Checkout {
    private Operadora operadora;
    private Impressora impressora;

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }

    public void fecharCompra(Compra compra, Cartao cartao) {
        boolean autorizado = this.operadora.autorizar(compra, cartao);

        if (autorizado) {
            this.impressora.imprimir(compra);
        } else {
            System.err.println("Pagamento foi negado!");
        }
    }
}
