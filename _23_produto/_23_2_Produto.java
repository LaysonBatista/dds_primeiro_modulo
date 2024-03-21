package _11_exercises._19_atacadao;

public class Produto_23_2 {
    String nome, descricao;
    Integer quantidade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }

    public void descrever() {
        System.out.println("\nDescrição: " + getDescricao() + " | " + "Quantidade: " + getQuantidade());
    }
}
