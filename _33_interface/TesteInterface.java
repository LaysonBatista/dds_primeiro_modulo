package _33_interface;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();

        EnviavelPorEmail e = (EnviavelPorEmail) i;  // Apontar para o objeto "i", que é do mesmo tipo "EnviavelPorEmail"
        e.enviar("filipe@gmail.com");

        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("Caixa de Leite");
    }
}
