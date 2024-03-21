package _34_exercicio_interface;

public enum FormaPagamento {
    REDE_CARD, CIELO;

    private Integer numeroCartao;
    private Float limiteCartao;

    public void setNumeroCartao(Integer numeroCartao) { this.numeroCartao = numeroCartao; }
    public Integer getNumeroCartao() { return numeroCartao; }

    public void setLimiteCartao(Float limiteCartao) { this.limiteCartao = limiteCartao; }
    public Float getLimiteCartao() { return limiteCartao; }
}
