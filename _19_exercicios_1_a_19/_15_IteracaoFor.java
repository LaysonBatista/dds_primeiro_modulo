package _37_logica_6_2;

public class IteracaoFor {
    public static void main(String[] args) {
        /*
        for (int i = 1; i <= 5; i++) {  // Cria e testa; Incrementa e testa.
            System.out.println((i == 5) ? (i + "ª posição.") : (i + "ª posição;"));
        }


        Double[] carrinhoCompras = new Double[]{50.0, 51.0, 52.0};
        Double total = 0.0;

        for (int i = 0; i < carrinhoCompras.length; i++) {
            total += carrinhoCompras[i];

            System.out.println("Iteração: " + i + ", Total: " + total);
        }


        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Parando...");
                break;  // Para / quebra
            }

            System.out.println("Iteração: " + i);
        }


        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("\nContinuando...\n");
                continue;   // Continua / pula para o próximo
            }

            System.out.println("Iteração: " + i);
        }
         */

        Integer[] produtos = new Integer[]{100, 225, 300};

        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];

            System.out.println("Produto de código: " + produto);

            if (produto.equals(225)) {
                System.out.println("\nProduto encontrado!");
                break;
            }
        }
    }
}
