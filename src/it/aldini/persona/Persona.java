package it.aldini.persona;

import it.aldini.cessi.Bagno;

abstract class Persona implements Runnable {
    
    private Bagno bagno;
    private String nome;

    public Persona(String nome, Bagno bagno) {
        this.nome = nome;
        this.bagno = bagno;
    }

    public void run() {
        System.out.println(nome + " ora esiste !");

        do {

        } while (!bagno.entra());

        try {
            wait(10000);
        } catch (InterruptedException e) {}

        bagno.esci();

        System.out.println(nome + " ora si sente libero");
    }

}
