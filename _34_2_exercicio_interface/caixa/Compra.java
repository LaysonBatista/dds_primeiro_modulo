package _11_exercises._47_1_exercicio_interface.caixa;

import _11_exercises._47_1_exercicio_interface.impressao.Impressora;
import _11_exercises._47_1_exercicio_interface.impressao.Imprimivel;

public class Compra implements Imprimivel {
    private String nome;
    private Float valor;

    public Compra (String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public void comprovante(Compra compra, Impressora impressora) {
        System.out.println("\n---------- COMPROVANTE ----------");
        System.out.println("Nome do produto: " + compra.getNome()
                + "\nValor: R$" + compra.getValor());

        impressora.marcaImpressora();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Float getValor() { return valor; }
    public void setValor(Float valor) { this.valor = valor; }
}
