package _11_exercises._15_televisor;

class Televisor22 {

    Integer canal = 130;
    Integer volume = 20;

    void mudarCanal(Integer novoCanal) {
        if (novoCanal.equals(canal)) {   // Tipo diferente e o valor é igual
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + novoCanal);
        }
    }

    void mudarVolume(Integer novoVolume) {
        if (novoVolume.equals(volume)) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            //volume = new Integer(novoVolume.byteValue());
            System.out.println("Volume alterado para " + novoVolume);
        }
    }

    // Estamos aproveitando a classe Televisor para fazer nosso teste
    public static void main(String[] args) {
        Televisor22 tv = new Televisor22();

        // Não deveria mudar o volume e canal
        tv.mudarVolume(20);
        tv.mudarCanal(130);

        System.out.print("\n");

        // Deveria mudar o volume e canal
        tv.mudarVolume(300);
        tv.mudarCanal(10);
    }
}
