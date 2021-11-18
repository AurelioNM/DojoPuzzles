package main.Dojo;

import java.util.LinkedHashMap;
import java.util.Map;

// Seu desafio é fazer um programa que leia o valor total a ser pago e o valor efetivamente pago,
// informando o menor número de cédulas e moedas que devem ser fornecidas como troco.

public class rascunho2 {


    public static void main(String[] args) {
        int[] notasEMoedas = {10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

        double troco = 90.64;

        int trocoEmCentavos = (int) (troco * 100); //9000

        Map<Double, Integer> valoresEquantidade = new LinkedHashMap<>();

        for (int notaAtual : notasEMoedas) {
            if (trocoEmCentavos >= notaAtual) {

                int qtd = trocoEmCentavos / notaAtual;
                valoresEquantidade.put(notaAtual / 100.0, qtd);
                trocoEmCentavos %= notaAtual;

                if (trocoEmCentavos == 0) {
                    break;
                }
            }
        }

        for (Map.Entry<Double, Integer> e : valoresEquantidade.entrySet()) {
            double notaMoeda = e.getKey();
            int qtd = e.getValue();

            String tipo;
            if (notaMoeda > 1) {
                tipo = "nota(s)";
            } else {
                tipo = "moeda(s)";
            }

            System.out.println();
            System.out.printf("%d %s de %.2f \n", qtd, tipo, notaMoeda);
        }




    }
}
