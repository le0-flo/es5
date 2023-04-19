package it.aldini.persona;

import it.aldini.cessi.*;

public class Donna extends Persona {
    public Donna(String nome) {
        super(nome, Cesso.getBagnoDonne());
    }
}
