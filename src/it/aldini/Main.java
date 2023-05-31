package it.aldini;

import it.aldini.cessi.Bagno;
import it.aldini.persona.Persona;

public class Main {
    public static void main(String[] args) throws Exception {

        Bagno donne = new Bagno("donne");
        Bagno uomini = new Bagno("uomini");

        Thread th1 = new Thread(new Persona("Gianni", uomini));
        Thread th2 = new Thread(new Persona("Gianna", donne));
        Thread th3 = new Thread(new Persona("Giacomo", uomini));
        Thread th4 = new Thread(new Persona("Marina", donne));
        Thread th5 = new Thread(new Persona("Marta", donne));
        Thread th6 = new Thread(new Persona("Leonardo", uomini));

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
    }
}
