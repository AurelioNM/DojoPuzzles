package main.Dojo.FizzBuzz;

public class Executavel {
    public static void main(String[] args) {

        int[] lista = new int[101];

        for (int i = 1; i <= 100; i++) {
            lista[i] = i;
            if (lista[i]%3 == 0 && lista[i]%5 == 0) {
                System.out.println("FizzBuzz");
            } else if (lista[i]%5 == 0) {
                System.out.println("Buzz");
            } else if (lista[i]%3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(lista[i]);
            }
        }




    }
}
