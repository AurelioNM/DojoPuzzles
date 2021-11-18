package main.Dojo;

import java.util.LinkedHashMap;
import java.util.Map;

public class rascunho {
    public static void main(String[] args) {

        // valores das notas e moedas, em centavos
        int[] notasMoedas = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};

        double valorTroco = 433.76;

// converte o valor para centavos
        int valorCentavos = (int) (valorTroco * 100);
        Map<Double, Integer> quantidades = new LinkedHashMap<>(); // guardar as quantidades de cada nota/moeda
        for (int nota : notasMoedas) {
            if (valorCentavos >= nota) {
                int qtd = valorCentavos / nota; // quantidade da nota/moeda
                quantidades.put(nota / 100.0, qtd);
                valorCentavos = valorCentavos % nota; // pega o resto da divisão, pra ter o valor restante
                if (valorCentavos == 0) {
                    break; // se o valor zerou, sai do for (não tem porque continuar)
                }
            }
        }

// imprime os resultados
        for (Map.Entry<Double, Integer> e : quantidades.entrySet()) {
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
