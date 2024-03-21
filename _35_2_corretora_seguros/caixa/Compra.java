package _11_exercises._47_2_exercicio_interface.caixa;

import _11_exercises._47_2_exercicio_interface.impressao.Imprimivel;
import _11_exercises._47_2_exercicio_interface.pagamento.Autorizavel;

public class Compra implements Autorizavel, Imprimivel {
    private double valorTotal;
    private String produto;
    private String nomeCliente;

    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public void setProduto(String produto) { this.produto = produto; }
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }

    public String getProduto() { return produto; }
    public String getNomeCliente() { return nomeCliente; }

    @Override
    public double getValorTotal() { return this.valorTotal; }
    @Override
    public String getCabecalhoPagina() { return this.getProduto() + " = " + this.getValorTotal(); }
    @Override
    public String getCorpoPagina() { return this.getNomeCliente(); }
}
