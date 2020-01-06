package com.mycompany.primerospasos;

public class Bucles {

    public Bucles() {

        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println("");
        int contador = 0;
        while (contador <= 10) {
            System.out.print(contador);
            contador++;
        }
        System.out.println("");
        int p = 10;
        do {
            System.out.print(p);
            p--;
        } while (p != 0);
        System.out.println("");
        String[] lista = {"Miguel", "Angel", "Huaycho", "Hermozo"};
        for (String x : lista) {
            System.out.print(x + " ");
        }
    }
}
