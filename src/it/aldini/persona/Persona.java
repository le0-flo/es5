package it.aldini.persona;

import it.aldini.cessi.Bagno;

public class Persona implements Runnable {
    private Bagno bagno;
    private String nome;

    public Persona(String nome, Bagno bagno) {
        this.nome = nome;
        this.bagno = bagno;
    }

    public void run() {
        boolean ciclo = true;

        while (ciclo) {
            if (bagno.entra(nome)) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("[ERRORE] InterruptedException");
                }
    
                bagno.esci();
                ciclo = false;

            } else {}
        }
    }

}
