package _11_exercises._28_TreinarCachorro;

import java.util.Scanner;

public class TreinadorCachorro_26_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DonoCachorro_26_3 donoCachorro = new DonoCachorro_26_3();

        System.out.println("\n\"Treinamento para Cachorro\"\n");
        System.out.print("Nome do(a) cachorro(a): ");
        String nomeCachorro = sc.nextLine();

        Boolean sabeSentar = donoCachorro.ensinarCachorroSentar(sc);
        Cachorro_26_2 cachorro;

        if (sabeSentar == false) {
            cachorro = new Cachorro_26_2(nomeCachorro);
        } else {
            cachorro = new Cachorro_26_2(nomeCachorro, sabeSentar);
        }

        infoCachorro(cachorro);
    }

    private static void infoCachorro(Cachorro_26_2 cachorro) {
        System.out.println("\nNome do cachorro(a): " + cachorro.getNome()
        + "\nEle(a) sabe sentar: " + cachorro.getSabeSentar());
    }
}
