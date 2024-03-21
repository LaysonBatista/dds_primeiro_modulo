package _11_exercises._43_desafio_4_2;

import _11_exercises._33_desafio_2.SituacaoConta;

public abstract class Conta {
    protected SituacaoConta situacaoConta;
    private String descricao, dataVencimento;
    private Double valor;

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }

    public SituacaoConta getSituacaoConta() { return situacaoConta; }
    public String getDescricao() { return descricao; }
    public String getDataVencimento() { return dataVencimento; }
    public Double getValor() { return valor; }

    public Conta() { this.situacaoConta = SituacaoConta.PENDENTE; }
    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.situacaoConta)) {
            System.out.println("Não pode cancelar uma conta que já foi paga: " + this.getDescricao());
        } else if (SituacaoConta.CANCELADA.equals(this.situacaoConta)) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: " + this.getDescricao());
        } else {
            System.out.println("Cancelando conta: " + this.getDescricao());
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public abstract void exibirDetalhes();
}
