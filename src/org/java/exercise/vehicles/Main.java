package org.java.exercise.vehicles;

/*
Aggiungere un’altra classe Main, con il metodo main nel quale viene creata un’istanza di GestoreFlotta e ne vengono testati tutti i metodi.
Può essere fatto implementando un menu interattivo usando lo Scanner
oppure impostando direttamente nel codice i dati con cui costruire i vari oggetti.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // creo un oggetto di gestione
        FleetManager fleetManager = new FleetManager();


        // creo lo scanner
        Scanner input = new Scanner(System.in);

        // inizializzo una variabile booleana
        boolean exit = false;

        // itero un ciclo while
        while (!exit){
            System.out.println("Welcome to the Fleet Manager!");
            System.out.println("What do you want to do? 1- Add vehicle, 2- Count type vehicles, 3- Find Vehicles by plate, 4- exit");
            String choice = input.nextLine();
            input.nextLine();
            // utilizzo uno switch
            switch (choice){
                case "1":
                    System.out.println("Type vehicle(Car/Bike): ");
                    String typeVehicle = input.nextLine();
                    System.out.println("Plate: ");
                    String plate = input.nextLine();
                    System.out.println("Registration year: ");
                    int registrationYear = input.nextInt();
                    // se il veicolo è un' auto, chiedo il numero di porte
                    if (typeVehicle.equalsIgnoreCase("Car")){
                        System.out.println("Number of car doors: ");
                        int doors = input.nextInt();
                        // aggiungo l'auto nell'oggetto fleetManager
                        fleetManager.addVehicles(new Car(plate, registrationYear, doors));
                        // altrimenti se è una moto, chiedo se c'è il cavalletto
                    } else if (typeVehicle.equalsIgnoreCase("Bike")) {
                        System.out.println("Motorcycle stand (true/false): ");
                        boolean stand = input.nextBoolean();
                        // aggiungo la moto nell'oggetto fleetManager
                        fleetManager.addVehicles(new Bike(plate, registrationYear, stand));

                        // altrimenti, veicolo non trovato
                    }else {
                        System.out.println("Vehicle not found");
                    }
                    break;
                case "2":
                    System.out.println("Type vehicle (Car/Bike): ");
                    String type = input.nextLine();
                    int countVehiclesCars = fleetManager.typeVehiclesCar(type);
                    System.out.println("Number of " + type + " : " + countVehiclesCars);
                    int countVehicleBike = fleetManager.typeVehicleBike();
                    System.out.println("Number of Bike: " + countVehicleBike);
                    break;
                case "3":
                    System.out.println("Plate: ");
                    String plateToFind = input.nextLine();
                    // richiamo il metodo per cercare tramite la targa
                    Vehicle foundVehicle = fleetManager.findVehicleByPlate(plateToFind);
                    // se il veicolo viene trovato, stampo il tipo di veicolo
                    if (foundVehicle != null){
                        System.out.println("Vehicle found: " + foundVehicle.toString());
                        // altrimenti, veicolo non trovato
                    } else {
                        System.out.println("Vehicle not found!");
                    }
                    break;
                case "4":
                    System.out.println("Thanks for passing by! See you next time!");
                    exit = true;
                    break;

                default:
                    System.out.println("invalid choice");

            }
        }


        // chiudo lo scanner
        input.close();


    }
}
