package _11_exercises._48_corretora_seguros;

public class Imovel implements Seguravel {
    private double valorMercado;
    private int areaContruida;

    public Imovel(double valorMercado, int areaContruida) {
        this.valorMercado = valorMercado;
        this.areaContruida = areaContruida;
    }

    @Override
    public Double calcularValorApolice() {
        double valorApolice = this.valorMercado * 0.003;
        valorApolice = valorMercado + (areaContruida * 0.5);

        return valorApolice;
    }

    @Override
    public String obterDescricao() {
        return "Imóvel com área construída de " + this.areaContruida
                + "m², e com valor de merdado de R$" + this.valorMercado;
    }
}
