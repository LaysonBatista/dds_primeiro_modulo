package _4_lista_de_tarefas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();
        String opcaoUsuario = null;
        int contador = 1;

        System.out.println("\n----------LISTA DE TAREFAS----------");

        do {
            System.out.println("\n[A] Anotar tarefa [X] Sair do programa");
            System.out.print("Opção: ");
            opcaoUsuario = scanner.next();
            scanner.nextLine();

            if (opcaoUsuario.equals("A") || opcaoUsuario.equals("a")) {
                System.out.print("\n" + contador + "ª tarefa: ");
                tarefas.add(contador + ". " + scanner.nextLine());
                contador++;
            } else if (!opcaoUsuario.equals("X") && !opcaoUsuario.equals("x")) {
                System.err.println("\nOpção inválida");
            }

        } while (!opcaoUsuario.equals("X") && !opcaoUsuario.equals("x"));

        Path arquivo = Paths.get("C:\\Users\\aluno\\Documents\\João Vitor\\java_programming\\src\\_4_lista_de_tarefas\\ListaDeTarefas.txt");
        Files.write(arquivo, tarefas);

        scanner.close();
        System.out.println("\nFechando do programa...");
    }
}
