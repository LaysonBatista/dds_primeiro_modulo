package _32_logica_5_4;

import java.util.Scanner;

public class FaturamentoEmpresa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float metaAnual = 100000.0F, faturamentoReal = 0.0F, mediaSalarial = 1425.5F,
                aumentoSalarial = mediaSalarial + (mediaSalarial / 100) * 15.75F,
                quebraSalarial = (mediaSalarial / 100) * 80, salarioMinimo = (mediaSalarial / 100) * 65;

        System.out.print("Informe o faturamento anual da empresa: ");
        faturamentoReal = entrada.nextFloat();
        
        boolean metaAtingida = faturamentoReal >= metaAnual;
        boolean metaParcial = faturamentoReal >= (metaAnual / 100) * 80;

        if(metaAtingida) {
            mediaSalarial = aumentoSalarial;
        } else if(metaParcial) {
            mediaSalarial = quebraSalarial;
        } else {
            mediaSalarial = salarioMinimo;
        }

        System.out.print("\nMédia salarial dos funcionários: \nR$" + mediaSalarial);
    }
}
