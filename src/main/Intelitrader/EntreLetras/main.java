package main.Intelitrader.EntreLetras;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
    /** input do user OK
     * conferir ordem OK
     * fazer a subtração OK
     *  alf.mapa.keySet() -> mostra as chaves 0 até 25
     *  alf.mapa.containsKey() -> confere se tem essa chave
     */
        Alfabeto alf = new Alfabeto();
        for(Character c = 'a'; c <= 'z'; c++) {
            alf.mapa.put( c.charValue(), alf.num++);
        }

        Scanner user = new Scanner(System.in);
        System.out.println("MANDA O PRIMEIRO AE");
        Character letra1 = user.next().toLowerCase().charAt(0);
        System.out.println("MANDA O SEGUNDO AE");
        Character letra2 = user.next().toLowerCase().charAt(0);

        Integer conv1 = alf.mapa.get(letra1);
        Integer conv2 = alf.mapa.get(letra2);
        System.out.println("====================" + System.lineSeparator());

        int diferenca = Math.abs(conv1 - conv2) - 1;
        if (conv1 > conv2)
            System.out.println("NÃO ESTÁ NA ORDEM ALFABÉTICA, ANIMAL");
        System.out.println("Há " + diferenca  + " letra(s) entre elas");



    }
}
