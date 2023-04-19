package it.aldini.cessi;

public class Cesso {
    
    private static Bagno bagnoUomini = new Bagno("Uomini");
    private static Bagno bagnoDonne = new Bagno("Donne");

    public static Bagno getBagnoUomini() {
        return bagnoUomini;
    }

    public static Bagno getBagnoDonne() {
        return bagnoDonne;
    }
}
