package _11_exercises._27_desafio;

public class Principal_25_1 {
    public static void main(String[] args) {
        Fornecedor_25_3 imobiliaria = new Fornecedor_25_3();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");

        Fornecedor_25_3 mercado = new Fornecedor_25_3();
        mercado.setNome("Mercado do João");

        ContaPagar_25_2 conta1 = new ContaPagar_25_2();
        conta1.setDescricao("Aluguel da matriz");

        conta1.setValor(1230d);
        conta1.setDataVencimento("10/05/2012");
        conta1.setFornecedor(imobiliaria);

        ContaPagar_25_2 conta2 = new ContaPagar_25_2(mercado, "Compras do mês", 390d, "19/05/2012");
        ContaPagar_25_2 conta3 = new ContaPagar_25_2(mercado, "Aluguel da filial", 700d, "11/05/2012");

        conta1.pagar();
        conta2.pagar();
        conta3.pagar();
    }
}
