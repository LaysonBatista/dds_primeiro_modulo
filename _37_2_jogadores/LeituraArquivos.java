package _11_exercises._49_2_jogadores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException { // Erros que podem estar relacionados ao Input ou Output
        Path arquivo = Paths.get("C:\\Users\\aluno\\Documents\\João\\Java\\src\\_11_exercises\\_49_2_jogadores\\jogadores.txt");
        List<String> linhas = Files.readAllLines(arquivo); // Collection<generics>

        for (int i = 0; i < linhas.size(); i++) {
            String nome = linhas.get(i);
            System.out.println("Jogador " + (i + 1) + ": " + nome);
        }
    }
}
