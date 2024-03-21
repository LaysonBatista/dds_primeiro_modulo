package _11_exercises._14_wrappers;

import static java.lang.Integer.valueOf;

public class Principal21 {
    public static void main(String[] args) {
        // byte, short, in, long, float, double e char  - tipos primitivos
        // Byte, Short, Integer, Long, Float, Double e Character    - wrappers

        int x = 10;
        Integer i = new Integer(10);    // Classe - wrapper do tipo primitivo int (embrulho) / Por ser uma classe, pode-se criar um objeto a partir dele
        //Integer i = valueOf(x); // Utilizado no Java 18+    = Integer i = x;
        //byte b = i.byteValue(); // Converte o valor para o tipo desejado

        String valor = "15.5";
        Float v = new Float(valor);

        System.out.println(v + 5);

        int idade = Integer.parseInt("27"); // Outra forma de conversão
        System.out.println("Daqui 5 anos você terá: " + (idade + 5) + " anos.");

        try {   // Tente executar
            double custo = Double.parseDouble("Vinte e três reais e cinquenta centavos.");
            System.out.println("Custo total: " + custo);
        } catch (NumberFormatException e) { // Captura o erro
            System.err.println("Número inválido para conversão.");
        }
    }
}
