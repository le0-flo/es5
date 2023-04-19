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
            return true;
        } else return false; 
    }

    public void esci() {
        occupato = false;
    }

}
