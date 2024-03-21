package _11_exercises._40_conta_bancaria;

public class TestePolimorfismo_1 {
    public static void main(String[] args) {
        Conta_1 conta = new Conta_1();
        conta.setSaldo(4000);
        imprimirSaldo(conta);

        System.out.print("\n");
        Conta_1 contaCorrente = new ContaCorrente_1();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);

        System.out.print("\n");
        Conta_1 contaPoupanca = new ContaPoupanca_1();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    private static void imprimirSaldo(Conta_1 conta) {
        System.out.println("Saldo: R$" + conta.getSaldo());

        if (conta instanceof ContaCorrente_1) {
            ContaCorrente_1 cc = (ContaCorrente_1) conta;
            System.out.println("O limite da cc: R$" + cc.getLimite());
        }

        if (conta instanceof ContaPoupanca_1) {
            ContaPoupanca_1 cp = (ContaPoupanca_1) conta;
            System.out.println("O rendimento da cp: R$" + cp.getRendimentos());
        }
    }
}
