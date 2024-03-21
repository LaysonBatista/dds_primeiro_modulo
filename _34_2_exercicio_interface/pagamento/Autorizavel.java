package _11_exercises._47_1_exercicio_interface.pagamento;

import _11_exercises._47_1_exercicio_interface.caixa.Compra;

public interface Autorizavel {
    public void autorizarCompra(Cartao cartao, Compra compra);
}
