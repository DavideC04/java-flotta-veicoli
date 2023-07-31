package org.java.exercise.vehicles;

/*
Hai ricevuto l’incarico di sviluppare un’applicazione Java per la gestione di una flotta di veicoli.
Ogni veicolo nella flotta può essere di due tipi: automobile o motocicletta.
Ogni veicolo ha un numero di targa univoco e un anno di immatricolazione.
Deve essere possibile visualizzare tutte le informazioni di ciascun tipo di veicolo.
 */
public class Vehicle {
    // CAMPI
    private String targa;
    private int numeroImmatricolazione;

    // COSTRUTTORI

    public Vehicle(String targa, int numeroImmatricolazione) {
        this.targa = targa;
        this.numeroImmatricolazione = numeroImmatricolazione;
    }


    // GETTER E SETTER

    public String getTarga() {
        return targa;
    }

    public int getNumeroImmatricolazione() {
        return numeroImmatricolazione;
    }




    // METODI


    @Override
    public String toString() {
        return "Vehicle{" +
                "targa='" + targa + '\'' +
                ", numeroImmatricolazione=" + numeroImmatricolazione +
                '}';
    }
}
