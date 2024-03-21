package _11_exercises._41_classes_abstratas;

public class ProdutoPerecivel extends Produto {
    String dataValidade;

    @Override   // Sobre-escrevendo o método
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + "\nData de validade: " + dataValidade);    // super se refere a classe pai
    }
}
