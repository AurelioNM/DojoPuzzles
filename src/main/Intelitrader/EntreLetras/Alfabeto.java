package main.Intelitrader.EntreLetras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alfabeto {

    public Map<Character, Integer> mapa = new HashMap<>();
    public Integer num = 0;
    public Character letra1;
    public Character letra2;
    public int conv1;
    public int conv2;


    public void constroiMapa(){
        for (Character c = 'a'; c <= 'z'; c++) {
            this.mapa.put(c.charValue(), this.num++);
        }
    }

    public void imputUser(){
        Scanner user = new Scanner(System.in);
        System.out.println("Digite a primeira letra");
        this.letra1 =  user.next().toLowerCase().charAt(0);
        System.out.println("Digite a segunda letra");
        this.letra2 =  user.next().toLowerCase().charAt(0);
        System.out.println("==========================");
        confereCaractere();
    }

    public void  confereCaractere() {
        if(!mapa.containsKey(letra1) || !mapa.containsKey(letra2)){
            System.out.println("Caractere inválido, insira apenas letras");
            imputUser();
        }
    }

    public void conversor(){
        this.conv1 = this.mapa.get(this.letra1);
        this.conv2 = this.mapa.get(this.letra2);
    }

    public void resultado(){
        int dif = Math.abs(this.conv1 - conv2) - 1;
        if (this.conv1 > this.conv2) {
            System.out.println("Não está na ordem alfabética!!");
        } else if (this.conv1 < this.conv2) {
            System.out.println("Quantidade de letras entre " + this.letra1 + " & " + this.letra2 +
                                " : " + dif);
        } else {
            System.out.println("Mesma letra, não há nada entre elas.");
        }
    }

}
