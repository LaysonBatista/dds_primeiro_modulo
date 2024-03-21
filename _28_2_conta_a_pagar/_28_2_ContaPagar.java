public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    private SituacaoConta situacaoConta;

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setFornecedor(Fornecedor fornecedor) { this.fornecedor = fornecedor; }

    public SituacaoConta getSituacaoConta() { return situacaoConta; }

    public ContaPagar() { this.situacaoConta = SituacaoConta.PENDENTE; }
    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        System.out.println("\n-------------------------");

        if (situacaoConta.equals(SituacaoConta.PAGA)) {
            System.err.println("Erro no pagamento! A conta já encontra-se PAGA.");
        } else if (situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.err.println("Erro no pagamento! A conta encontra-se CANCELADA.");
        } else {
            System.out.println("Fornecedor: " + this.fornecedor.getNome()
                    + "\nDescrição: " + this.descricao
                    + "\nValor: R$" + this.valor
                    +"\nData de Vencimento: " + this.dataVencimento);

            this.situacaoConta = SituacaoConta.PAGA;
            System.out.println("\nConta PAGA com sucesso!");
        }
    }

    public void cancelar() {
        System.out.println("\n-------------------------");

        if (situacaoConta.equals(SituacaoConta.PAGA)) {
            System.err.println("Erro no cancelamento! A conta encontra-se PAGA.");
        } else if (situacaoConta.equals(SituacaoConta.CANCELADA)) {
            System.err.println("Erro no cancelamento! A conta já encontra-se CANCELADA.");
        } else {
            System.out.println("Fornecedor: " + this.fornecedor.getNome()
                    + "\nDescrição: " + this.descricao
                    + "\nValor: R$" + this.valor
                    +"\nData de Vencimento: " + this.dataVencimento);

            this.situacaoConta = SituacaoConta.CANCELADA;
            System.out.println("\nConta CANCELADA com sucesso!");
        }
    }
}
