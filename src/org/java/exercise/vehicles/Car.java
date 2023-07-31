package org.java.exercise.vehicles;
/*

Ogni veicolo nella flotta può essere di due tipi: automobile o motocicletta.
Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
Le automobili hanno un campo per indicare il numero di porte

 */

public class Car extends Vehicle {
    // CAMPI
    private int numeroPorte;

    // COSTRUTTORI
    public Car(String targa, int numeroImmatricolazione, int numeroPorte) {
        super(targa, numeroImmatricolazione);
        this.numeroPorte = numeroPorte;
    }
    // GETTER E SETTER
    public int getNumeroPorte() {
        return numeroPorte;
    }

    // METODI

    @Override
    public String toString() {
        return super.toString() + "numeroPorte=" + numeroPorte +
                '}';
    }
}
