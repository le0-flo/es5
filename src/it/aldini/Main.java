package it.aldini;

import it.aldini.persona.Donna;
import it.aldini.persona.Uomo;

public class Main {
    public static void main(String[] args) throws Exception {
        Uomo u1 = new Uomo("Gianni");
        Uomo u2 = new Uomo("Marco");
        Uomo u3 = new Uomo("Caligola");
        Donna d1 = new Donna("Anna");
        Donna d2 = new Donna("Marta");
        Donna d3 = new Donna("Giorgia");

        Thread thu1 = new Thread(u1);
        Thread thu2 = new Thread(u2);
        Thread thu3 = new Thread(u3);
        Thread thd1 = new Thread(d1);
        Thread thd2 = new Thread(d2);
        Thread thd3 = new Thread(d3);

        thu1.start();
        thu2.start();
        thu3.start();
        thd1.start();
        thd2.start();
        thd3.start();
    }
}
