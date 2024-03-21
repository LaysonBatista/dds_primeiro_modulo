package _11_exercises._47_1_exercicio_interface.impressao.impressoras;

import _11_exercises._47_1_exercicio_interface.impressao.Impressora;

public class ImpressoraEpson implements Impressora {
    @Override
    public void marcaImpressora() {
        System.out.println("\n---------- IMPRESSORA EPSON ----------");
    }
}
