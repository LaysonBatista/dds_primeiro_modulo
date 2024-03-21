package _11_exercises._43_desafio_4_2;

import _11_exercises._33_desafio_2.SituacaoConta;

public class ContaPagar extends Conta {
    private Fornecedor fornecedor;  // Composição.

    public Fornecedor getFornecedor() { return fornecedor; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    public ContaPagar() {}
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga: " + this.getDescricao() + ".");
        } else {
            System.out.println("\n-----------------------------------");
            System.out.println("Descrição: " + this.getDescricao()
                    + "\nData de Vencimento: " + this.getDataVencimento()
                    + "\nValor: R$" + this.getValor()
                    + "\nFornecedor: " + this.fornecedor.getNome());

            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public void exibirDetalhes() {
        System.out.println("\nConta a Pagar");
        System.out.println("------------------------------");
        System.out.println("\nFornecedor: " + this.getFornecedor().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("------------------------------");
    }
}
