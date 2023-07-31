package org.java.exercise.vehicles;
/*
Creare la gerarchia di classi necessarie e una classe GestoreFlotta che conterrà una lista di veicoli.
La classe GestoreFlotta deve permettere di:
aggiungere nuovi veicoli alla flotta
contare quanti veicoli ci sono di un determinato tipo (automobile o motocicletta)
trovare un veicolo specifico tramite il numero di targa
 */

import java.util.ArrayList;

public class FleetManager {


    // creo una lista di veicoli
    ArrayList<Vehicle> vehicles = new ArrayList<>();
    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    // contare quanti veicoli ci sono di un determinato tipo (auto o moto)
    public int typeVehiclesCar(String type){
        // inizializzo un contatore uguale a 0
        int c = 0;
        for (Vehicle vehicle: vehicles) {
            // se il veicolo è un'auto, aumenta il contatore
            if (vehicle instanceof Car){
                c++;
            }
        }
        return c;
    }
    public int typeVehicleBike(){
        int b = 0;
        for (Vehicle vehicle :vehicles) {
            // se il veicolo è una moto, aumenta il contatore
            if (vehicle instanceof Bike){
                b++;
            }
        }
        return b;
    }
        // metodo per trovare un veicolo tramite un numero di targa
    public Vehicle findVehicleByPlate(String targa){
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTarga().equalsIgnoreCase(targa)){
                return vehicle;
            }
        }
        // ritorna un valore null se la targa non è presente nella lista
        return null;

    }
}





