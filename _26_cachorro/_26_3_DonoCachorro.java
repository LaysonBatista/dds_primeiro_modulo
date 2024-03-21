package _11_exercises._28_TreinarCachorro;

import java.util.Scanner;

public class DonoCachorro_26_3 {
    public Boolean ensinarCachorroSentar(Scanner scanner) {
        System.out.print("Informe se deseja ensinar o cachorro(a) a sentar: [S/N]: ");
        String sabeSentar = scanner.next();
        scanner.nextLine();

        if (sabeSentar.equals("S") || sabeSentar.equals("s")) {
            System.out.println("\nEnsinando ele(a) a sentar...");
            return true;
        } else {
            return false;
        }
    }
}
