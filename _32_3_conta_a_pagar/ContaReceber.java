package _11_exercises._43_desafio_4_2;

import _11_exercises._33_desafio_2.SituacaoConta;

public class ContaReceber extends Conta {
    private Cliente cliente;

    public ContaReceber() {}
    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    }

    public void cancelar() {
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. "
            + "É muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            super.cancelar();
        }
    }

    public void receber() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que já está paga: " + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: " + this.getDescricao());
        } else {
            System.out.println("Recebendo conta " + this.getDescricao()
                    + " no valor de R$" + this.getValor()
                    + " com a data de vencimento para " + this.getDataVencimento()
                    + ", para o cliente " + this.getCliente().getNome());

            this.situacaoConta = SituacaoConta.PAGA;
        }
    }

    public void exibirDetalhes() {
        System.out.println("\nConta a Receber");
        System.out.println("------------------------------");
        System.out.println("\nFornecedor: " + this.getCliente().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("------------------------------");
    }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}
