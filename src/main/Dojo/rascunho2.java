package main.Dojo;

import java.util.LinkedHashMap;
import java.util.Map;

public class rascunho2 {
    public static void main(String[] args) {
        int[] notasEMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

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
                tipo = "nota";
            } else {
                tipo = "moeda";
            }
            System.out.printf("%d %s%s de %.2f\n", qtd, tipo, qtd > 1 ? "s" : "", notaMoeda);
        }




    }
}
