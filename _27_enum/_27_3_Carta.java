package _11_exercises._31_enumeracoes;

public class Carta_27_3 {
    private int numero;
    private Naipe_27_2 naipe;

    public Carta_27_3(int numero, Naipe_27_2 naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public void imprimirCarta() {
        System.out.println("Sou " + numero + " de " + naipe
        + ". E tenho a cor " + naipe.getCor());
    }
}
