package _11_exercises._39_FilBank;

public class ContaCorrente extends Conta {
    private TipoConta tipoConta = TipoConta.CORRENTE;
    private Float limiteConta = getSaldo() / 2.0F;

    public float getLimiteConta() { return limiteConta; }
}
