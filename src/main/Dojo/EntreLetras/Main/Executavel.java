package main.Dojo.EntreLetras.Main;

public class Executavel {
    public static void main(String[] args) {

        Alfabeto alfabeto = new Alfabeto();
        alfabeto.constroiMapa();

        alfabeto.calculoEntreLetras('k', 'b');
        alfabeto.calculoEntreLetras('n', 'f');
        alfabeto.calculoEntreLetras('i', 'u');
        alfabeto.calculoEntreLetras('a', 'z');
        alfabeto.calculoEntreLetras('h', 'h');
    }
}
