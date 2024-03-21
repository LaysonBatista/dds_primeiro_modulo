package _11_exercises._9_metodos;

public class Veiculo {
    String fabricante, modelo, cor; // Propriedades
    Integer anoFabricacao;
    Proprietario dono = new Proprietario();

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public Integer getAnoFabricacao() { return anoFabricacao; }
    public void setAnoFabricacao(Integer anoFabricacao) { this.anoFabricacao = anoFabricacao; }

    void ligar() {
        System.out.println("Ligando o carro: " + modelo);   // Comportamento
    }
}
