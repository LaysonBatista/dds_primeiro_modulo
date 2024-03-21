package _11_exercises._41_classes_abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto p = new ProdutoPerecivel();
        p.setDescricao("Caixa de Leite");

        ProdutoPerecivel pp = (ProdutoPerecivel) p; // pp aponta para p (cast)
        pp.dataValidade = "10/07/2022";

        System.out.print("\n");
        p.imprimirDescricao();
    }
}
