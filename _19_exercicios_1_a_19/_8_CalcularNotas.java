package _4_exercises;

import java.util.Scanner;

public class CalcularNotas2 {

    public static void main(String[] args) {
        Scanner receberValor = new Scanner(System.in);

        System.out.println("\"Média de Notas\"\n");

        System.out.print("Informe a quantidade de notas: ");
        int quantidadeNotas = receberValor.nextInt();

        float somaNotas = 0;

        for(int contador = 1; contador <= quantidadeNotas; contador++) {
            System.out.print("Digite a " + contador + "ª nota: ");
            float nota = receberValor.nextFloat();

            somaNotas += nota;
        }
        
        float mediaNotas = somaNotas / quantidadeNotas;
        System.out.println("\nMédia das notas: " + mediaNotas);
        
        String situacaoAluno = mediaNotas >= 7 ? "Aluno aprovado!" : "Aluno reprovado!";
        System.out.println(situacaoAluno);
        
        receberValor.close();
    }
}
