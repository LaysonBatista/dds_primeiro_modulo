package _11_exercises._23_ar_condicionado;

public class Comportamento_24_2 {
    Integer temperaturaAtual = 21;

    public Comportamento_24_2(Integer temperaturaDesejada) {
        if (temperaturaDesejada >= 17 && temperaturaDesejada <= 25) {
            this.temperaturaAtual = temperaturaDesejada;
        } else if (temperaturaDesejada < 17) {
            System.err.println("Valor abaixo do permitido!");
        } else if (temperaturaDesejada > 25) {
            System.err.println("Valor acima do permitido!");
        }

    }

    public void exibirTemperaturaAtual() {
        System.out.println("\nTemperatura atual: " + temperaturaAtual);
    }
}
