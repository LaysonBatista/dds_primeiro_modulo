package _11_exercises._49_2_jogadores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();   // Collection (não precisa declarar o tamanho, que é variável)

        System.out.println("\n---------- CADASTRO DE JOGADORES ----------");

        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º jogador: ");
            String nome = scanner.nextLine();
            linhas.add(nome);
        }

        Path arquivo = Paths.get("C:\\Users\\aluno\\Documents\\João\\Java\\src\\_11_exercises\\_49_2_jogadores\\jogadores.txt");
        Files.write(arquivo, linhas);

        scanner.close();
        System.out.println("\nJogadores cadastrados com sucesso!");
    }
}
