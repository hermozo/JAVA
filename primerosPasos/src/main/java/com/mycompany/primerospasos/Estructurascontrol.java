package com.mycompany.primerospasos;

public class Estructurascontrol {

    public Estructurascontrol() {
        try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("FInalizo");
        }
    }
}
