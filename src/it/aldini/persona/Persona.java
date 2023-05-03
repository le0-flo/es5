package it.aldini.persona;

import it.aldini.cessi.Bagno;

abstract class Persona implements Runnable {
    
    private Bagno bagno;
    private String nome;
    private static Object lock = new Object();

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

                try {
                    synchronized (lock) {
                        lock.notifyAll();
                    }
                } catch (IllegalMonitorStateException e) {
                    System.out.println("[ERRORE] IllegalMonitorState");
                }

            } else {

                try {
                    synchronized (lock) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    System.out.println("[ERRORE] Interrupted");
                } catch (IllegalMonitorStateException e) {
                    System.out.println("[ERRORE] IllegalMonitorState");
                }

            }
        }
    }

}
