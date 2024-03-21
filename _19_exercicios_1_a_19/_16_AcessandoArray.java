package _2_estrutura_for_e_array;

public class AcessandoArray {
    public static void main(String[] args) {
        Float[] notas = new Float[] { 7.5F, 8.25F, 6F, 10F, 5.5F, 9.75F, 3F };

        int quantidadeNotas = 0;
        float somaNotas = 0.0F, mediaNotas = 0.0F;

        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas += 1;
            somaNotas += notas[i];
        }

        mediaNotas = somaNotas / quantidadeNotas;

        System.out.printf("\nMédia das notas do aluno: %.2f\n", mediaNotas);
    }
}
