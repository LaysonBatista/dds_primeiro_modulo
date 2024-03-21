package _11_exercises._39_FilBank;

public class Conta {
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    private Float saldo;

    void imprimirConta(TipoConta tipoConta) {
        System.out.println("Saldo: " + this.saldo);

        if (tipoConta.equals(TipoConta.CORRENTE)) {
            System.out.println("Limite da conta: " + contaCorrente.getLimiteConta());
        } else if (tipoConta.equals(TipoConta.POUPANCA)) {
            System.out.println("Rendimentos da conta: " + contaPoupanca.getRendimento());
        }
    }

    public Float getSaldo() { return saldo; }
    public void setSaldo(Float saldo) { this.saldo = saldo; }
}
