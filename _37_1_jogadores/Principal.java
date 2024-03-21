package _37_jogadores;

import java.io.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String nomesJogadores[] = new String[2];

        System.out.println("\n---------- CADASTRAR JOGADORES ----------");
        for (int i = 0; i < nomesJogadores.length; i++) {
            System.out.print("Informe o nome do " + (i + 1) + "º jogador: ");
            nomesJogadores[i] = scanner.nextLine();
        }

        // Gravar arquivo
        try {
            FileWriter arquivo = new FileWriter("C:\\Users\\aluno\\Documents\\João\\Java\\src\\_11_exercises\\_49_jogadores\\nomes_jogadores");
            PrintWriter gravarArquivos = new PrintWriter(arquivo);

            for (int i = 0; i < nomesJogadores.length; i++) {
                gravarArquivos.println(nomesJogadores[i]);
            }

            arquivo.flush();
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ler arquivo
        FileReader dados = new FileReader("C:\\Users\\aluno\\Documents\\João\\Java\\src\\_11_exercises\\_49_jogadores\\nomes_jogadores");
        BufferedReader conteudo = new BufferedReader(dados);

        System.out.println("\n---------- LISTAR JOGADORES ----------");
        String linha = conteudo.readLine(); // Ler primeira linha
        while (linha != null){
            System.out.println(linha);
            linha = conteudo.readLine();    // Ler a próxima linha
        }

        dados.close();
    }
}
