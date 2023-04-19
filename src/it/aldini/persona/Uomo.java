package it.aldini.persona;

import it.aldini.cessi.*;

public class Uomo extends Persona {
    public Uomo(String nome) {
        super(nome, Cesso.getBagnoUomini());
    }
}
