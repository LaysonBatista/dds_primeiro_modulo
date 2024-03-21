package _11_exercises._28_TreinarCachorro;

public class Cachorro_26_2 {
    private String nome;
    private Boolean sabeSentar = false;

    public String getNome() { return nome; }
    public Boolean getSabeSentar() { return sabeSentar; }

    public Cachorro_26_2(String nome) { this.nome = nome; }
    public Cachorro_26_2(String nome, Boolean sabeSentar) {
        this(nome);
        this.sabeSentar = sabeSentar;
    }
}
