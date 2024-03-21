package _34_exercicio_interface;

import java.util.Scanner;

public class Cliente implements Imprimivel, Pagavel {
    private String nome;
    private FormaPagamento formaPagamento;
    private Impressora impressora;

    public Cliente(String nome, FormaPagamento formaPagamento, Impressora impressora) {
        this.nome = nome;
        this.formaPagamento = formaPagamento;
        this.impressora = impressora;
    }

    @Override
    public void pagamento(Scanner sc) {
        System.out.println("\n---------- PAGAMENTO ----------");

        System.out.println("Informe o número do cartão: ");
        formaPagamento.setNumeroCartao(sc.nextInt());
        sc.nextLine();

        System.out.println("\nProcessando pagamento...");

        if (this.formaPagamento.equals(FormaPagamento.REDE_CARD)) {
            if (formaPagamento.getNumeroCartao().equals(456)) {
                System.out.println("Pagamento efetuado com SUCESSO!");
                formaPagamento.setLimiteCartao(200f);
            } else {
                System.err.println("Número do cartão INVÁLIDO!");
            }
        } else if (this.formaPagamento.equals(FormaPagamento.CIELO)) {
            if (formaPagamento.getNumeroCartao().equals(123)) {
                System.out.println("Pagamento efetuado com SUCESSO!");
                formaPagamento.setLimiteCartao(100f);
            } else {
                System.err.println("Número do cartão INVÁLIDO!");
            }
        } else {
            System.err.println("Forma de pagamento INVÁLIDA!");
        }
    }

    @Override
    public void notaFiscal(Scanner sc) {
        System.out.println("\n---------- IMPRESSÃO ----------");

        System.out.println("Informe a impressora: \n[1] Epson \n[2] HP");
        System.out.println("\nOpção: ");
        int opcaoImpressora = sc.nextInt();
        sc.nextLine();

        System.out.println("\nProcessando...");

        if (opcaoImpressora == 1) {
            this.impressora = Impressora.EPSON;
        } else if (opcaoImpressora == 2) {
            this.impressora = Impressora.HP;
        } else {
            System.err.println("Impressora INVÁLIDA!");
        }
    }

    public String getNome() { return nome; }
    public FormaPagamento getFormaPagamento() { return formaPagamento; }
    public Impressora getImpressora() { return impressora; }
}
