package _11_exercises._47_2_exercicio_interface.impressao.impressoras;

import _11_exercises._47_2_exercicio_interface.impressao.Impressora;
import _11_exercises._47_2_exercicio_interface.impressao.Imprimivel;

public class ImpressoraEpson implements Impressora {
    @Override
    public void imprimir(Imprimivel imprimivel) {
        System.out.print("\n");
        System.out.println("******************************");
        System.out.println(imprimivel.getCabecalhoPagina());
        System.out.println("******************************");
        System.out.println(imprimivel.getCorpoPagina());
        System.out.print("\n");
        System.out.println("------------------------------");
        System.out.println("-----        EPSON       -----");
        System.out.println("------------------------------");
    }
}
