package com.mycompany.primerospasos;

public class Matrices {

    private int numeros[][];

    public Matrices() {
        this.numeros = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.numeros[i][j] = this.random();
            }
        }
        this.mostrar();
    }

    private int random() {
        return (int) (Math.random() * 10 + 1);
    }

    public void mostrar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(this.numeros[i][j]);
            }
            System.out.println();
        }
    }
}
