package org.java.exercise.vehicles;
/*
Ogni veicolo nella flotta può essere di due tipi: automobile o motocicletta.
Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
le motociclette hanno un campo per indicare se sono dotate di cavalletto o meno.
 */

public class Bike extends Vehicle{
    // CAMPI
    private boolean cavalletto;

    // COSTRUTTORI

    public Bike(String targa, int numeroImmatricolazione, boolean cavalletto) {
        super(targa, numeroImmatricolazione);
        this.cavalletto = cavalletto;
    }

    // GETTER E SETTER

    public boolean isCavalletto(){
        return cavalletto;
    }

    // METODI

    public String getCavalletto(){
        return cavalletto ? "Presente" : "Assente";
    }


    @Override
    public String toString() {
        return super.toString() + "cavalletto=" + cavalletto +
                '}';
    }
}
