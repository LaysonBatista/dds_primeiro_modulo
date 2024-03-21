package _11_exercises._27_desafio;

public class ContaPagar_25_2 {
    private String descricao, dataVencimento;
    private Double valor;
    private Fornecedor_25_3 fornecedor;  // Composição.

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public void setDataVencimento(String dataVencimento) { this.dataVencimento = dataVencimento; }
    public void setValor(Double valor) { this.valor = valor; }
    public void setFornecedor(Fornecedor_25_3 fornecedor) { this.fornecedor = fornecedor; }

    public ContaPagar_25_2() {}
    public ContaPagar_25_2(Fornecedor_25_3 fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public void pagar() {
        System.out.println("\n-----------------------------------");
        System.out.println("Descrição: " + this.descricao
        + "\nData de Vencimento: " + this.dataVencimento
        + "\nValor: R$" + this.valor
        + "\nFornecedor: " + this.fornecedor.getNome());
    }
}
