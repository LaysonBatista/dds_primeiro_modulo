package _11_exercises._39_FilBank;

public class ContaPoupanca extends Conta {
    private TipoConta tipoConta = TipoConta.POUPANCA;
    private Float rendimento = getSaldo() * 0.02F;

    public Float getRendimento() { return rendimento; }
}
