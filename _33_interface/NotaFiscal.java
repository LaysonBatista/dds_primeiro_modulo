package _33_interface;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
    private int numero;

    public NotaFiscal(int numero) { this.numero = numero; }

    public void adicionarPedido(String produto) {}

    @Override
    public void imprimir() {
        System.out.println("\n-------------------------");
        System.out.print("Número da nota fiscal: " + this.numero);
    }

    @Override
    public void enviar(String email) {
        System.out.println("\n-------------------------");
        System.out.print("Enviando a nota \"" + this.numero + "\" para o e-mail \"" + email + "\"");
    }
}
