package _43_logica_7_2;

import java.util.Scanner;

public class TarefasImportantesDiarias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String tarefasImportantes[] = new String[5];

        System.out.println("\n\"Cinco Tarefas Mais Importantes do Dia\"\n");

        for (int i = 0; i < tarefasImportantes.length; i++) {
            System.out.print((i + 1) + "ª tarefa: ");
            tarefasImportantes[i] = entrada.nextLine();
        }

        for (int i = 0; i < tarefasImportantes.length; i++) {
            if (i == 0) {
                System.out.println("\n\"Lista\"\n");
            }

            System.out.println((i + 1) + ". " + tarefasImportantes[i]);
        }

        entrada.close();
    }
}
