package _11_exercises._31_enumeracoes;

public enum Naipe_27_2 {
    OURO("Vermelho"), PAUS("Preto"), ESPADA("Preto"), COPAS("Vermelho");

    private String cor;

    Naipe_27_2(String cor) { this.cor = cor; }  // Abominação.
    public String getCor() { return cor; }
}
