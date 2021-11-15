package main.Intelitrader.EntreLetras.Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alfabeto {

    public Map<Character, Integer> mapa = new HashMap<>();
    public Integer num = 1;
    public Character letra1;
    public Character letra2;
    public int numeroDaLetra1;
    public int numeroDaLetra2;


    public void constroiMapa(){
        for (Character c = 'a'; c <= 'z'; c++) {
            mapa.put(c.charValue(), num++);
        }
    }

    public void recebeLetras(Character um, Character dois){
        letra1 = um;
        letra2 = dois;

        confereCaractere();
        conversor();
        resultado();
    }

    public void  confereCaractere() {
        if(!mapa.containsKey(letra1.charValue()) || !mapa.containsKey(letra2.charValue())){
            System.out.println("Caractere inválido, insira apenas letras");
        }
    }

    public void conversor(){
        numeroDaLetra1 = mapa.get(letra1.charValue());
        numeroDaLetra2 = mapa.get(letra2.charValue());
    }

    public void resultado(){
        int dif;
        if (numeroDaLetra1 != numeroDaLetra2){
            dif = Math.abs(numeroDaLetra1 - numeroDaLetra2) - 1;
        } else {
            dif = Math.abs(numeroDaLetra1 - numeroDaLetra2);
        }

        if (numeroDaLetra1 > numeroDaLetra2) {
            System.out.println("'"+letra1+"',"+"'"+letra2+"' = "+
                    "Nao esta na ordem alfabetica!");
        } else if (numeroDaLetra1 <= numeroDaLetra2) {
            System.out.println("'"+letra1+"',"+"'"+letra2+"' = "+ dif );
        }
    }
}
