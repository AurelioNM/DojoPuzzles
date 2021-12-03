package main.Dojo.CaixaEletronico.Main;

import java.util.LinkedHashMap;
import java.util.Map;

public class Caixa {

    public int[] notas = {100, 50, 20, 10};
    public int valor;
    public Map<Integer, Integer> notasEQuantidades = new LinkedHashMap<>();

    public void sacar(int valor){

        this.valor = valor;
        System.out.println("=========================================================================");
        System.out.println("Valor do saque: R$" + valor + ",00");
        System.out.println("Notas a receber: ");

        for (int notaAtual : notas) {
            if (valor >= notaAtual) {
                int quantidade = valor / notaAtual;
                notasEQuantidades.put(notaAtual, quantidade);
                valor = valor % notaAtual;
                if (valor == 0) {
                    break;
                } else if (valor < 10) {
                    throw new IllegalArgumentException("Notas indisponiveis");
                }
            }
        }

        for (Map.Entry<Integer, Integer> mapa : notasEQuantidades.entrySet()) {
            int nota = mapa.getKey();
            int quantidade = mapa.getValue();

            System.out.printf("%d nota(s) de R$%d,00; ", quantidade, nota);
        }
        System.out.println(System.lineSeparator() + "=========================================================================");
    }

    public static void main(String[] args) {
        Caixa saque = new Caixa();
        saque.sacar(3410);
    }

}
