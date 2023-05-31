package it.aldini.cessi;

public class Bagno {
    private String tipo;
    private Boolean occupato;

    public Bagno(String tipo) {
        occupato = false;
        this.tipo = tipo;
    }

    public synchronized Boolean entra(String nome) {
        if (!occupato) {
            occupato = true;
            System.out.println("Il bagno " + tipo + " è occupato da " + nome);
            
            return true;
        } else {
            try {
                wait();
            } catch (IllegalMonitorStateException e) {
                System.out.println("[ERRORE] IllegalMonitorException");
            } catch (InterruptedException e) {
                System.out.println("[ERRORE] InterruptedException");
            }
            
            return false;
        }
    }

    public synchronized void esci() {
        occupato = false;
        System.out.println("Il bagno " + tipo + " è libero");

        notifyAll();
    }
}
