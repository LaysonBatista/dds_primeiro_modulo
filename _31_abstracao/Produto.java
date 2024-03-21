package _11_exercises._41_classes_abstratas;

public abstract class Produto { // Não se pode instanciar objetos na classe abstrata (só na concreta) - geralmente a classe mão é abstrata e a filha possui detalhes
    String descricao;

    public abstract void imprimirDescricao();   // Só se pode ter um método abstrato em uma classe abstrata // Quero isso, mas não quero usar agora

    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getDescricao() { return descricao; }
}
