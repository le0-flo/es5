package it.aldini.cessi;

public class Bagno {
    private String tipo;
    private Boolean occupato;

    public Bagno(String tipo) {
        this.tipo = tipo;
        occupato = false;
    }

    public synchronized Boolean entra(String nome) {
        if (!occupato) {
            occupato = true;
            System.out.println("Il bagno " + tipo + " è occupato da " + nome);
            
            return true;
        } else return false;
    }

    public synchronized void esci() {
        occupato = false;
        System.out.println("Il bagno " + tipo + " è libero");
    }
}
