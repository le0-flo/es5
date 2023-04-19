package it.aldini.cessi;

public class Bagno {
    private String tipo;
    private Boolean occupato;

    public Bagno(String tipo) {
        this.tipo = tipo;
        occupato = false;
    }

    public Boolean entra() {
        if (!occupato) {
            occupato = true;
            System.out.println("Il bagno " + tipo + " è occupato");
            return true;
        } else return false; 
    }

    public void esci() {
        occupato = false;
        System.out.println("Il bagno " + tipo + " è libero");
    }

}
