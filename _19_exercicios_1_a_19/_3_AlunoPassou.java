package _12_logica_3_8;

import java.util.Scanner;

public class AlunoPassou {
    static final Float NOTA_APROVACAO = 70.0F;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        float nota1 = (float) sc.nextDouble();

        System.out.print("Agora, informe a segunda nota: ");
        float nota2 = (float) sc.nextDouble();

        float somaNotas = (float) (nota1 + nota2);
        float quantidadeNotas = 2.0F;
        float mediaNotas = (float) (somaNotas / quantidadeNotas);

        boolean alunoAprovado = mediaNotas >= NOTA_APROVACAO;

        System.out.println("\nMédia do aluno: " + mediaNotas);
        System.out.println(alunoAprovado ? "Aluno aprovado!" : "Aluno reprovado!");
    }
}
