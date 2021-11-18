package main.Dojo.Troco.Main;

// Seu desafio é fazer um programa que leia o valor total a ser pago e o valor efetivamente pago,
// informando o menor número de cédulas e moedas que devem ser fornecidas como troco.

import java.util.LinkedHashMap;
import java.util.Map;

public class Troco {

    int[] notasEMoedas = {1000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    Map<Double, Integer> valoresEQuantidade = new LinkedHashMap<>();
    double valorTotal;
    double valorPago;
    double troco;
    int trocoEmCentavos;

    public void pagamento(double total, double pago) {
        valorTotal = total;
        valorPago = pago;
        troco = valorTotal - valorPago;
        trocoEmCentavos = (int) (troco * 100);

        System.out.println("==================================================");
        System.out.println("Valor Total:  " + valorTotal + "      Valor Pago: " + valorPago);
        System.out.println("Troco: ");
        analiseTroco();
        devolveTroco();
    }

    public void analiseTroco() {
        for (int notaAtual : notasEMoedas) {
            if (trocoEmCentavos >= notaAtual) {
                int qtd = trocoEmCentavos / notaAtual;
                valoresEQuantidade.put((notaAtual / 100.0), qtd);
                trocoEmCentavos = trocoEmCentavos % notaAtual;

                if (trocoEmCentavos == 0) {
                    break;
                }
            }
        }

    }

    public void devolveTroco() {

        for (Map.Entry<Double, Integer> mapa : valoresEQuantidade.entrySet()) {
            double notaMoeda = mapa.getKey();
            int qtd = mapa.getValue();

            String tipoTroco;
            if (notaMoeda > 1){
                tipoTroco = "nota(s)";
            } else {
                tipoTroco = "moeda(s)";
            }
            System.out.println(qtd + " " + tipoTroco + " de " + notaMoeda);
        }
        System.out.println("==================================================");
    }


    public static void main(String[] args) {
        Troco testando = new Troco();

        testando.pagamento(14300, 5334.65);


    }
}
