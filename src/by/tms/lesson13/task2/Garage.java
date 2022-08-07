package by.tms.lesson13.task2;

import java.util.HashMap;

public class Garage {


    private HashMap<Car, Integer> garage = new HashMap<Car, Integer>();

    public HashMap<Car, Integer> getHashmap() {
        return garage;
    }

    public void setHashmap(HashMap<Car, Integer> garage) {
        this.garage = garage;
    }

    // car parking
    public void parkAuto(Car carToPark, Integer numberOfCars) {

        if (garage.containsKey(carToPark)) {
            garage.replace(carToPark, garage.get(carToPark) + numberOfCars);
        } else {
            garage.put(carToPark, numberOfCars);
        }

    }

    // car departure
    public void departureAuto(Car carToDeparture, Integer numberOfCars) {

        if (garage.containsKey(carToDeparture)) {
            garage.replace(carToDeparture, garage.get(carToDeparture) - numberOfCars);

            if (garage.get(carToDeparture) <= 0) {
                garage.remove(carToDeparture);
            }

        }

    }

    // check what is in garage
    public void checkAutoInGarage(Car carToCheck) {

        if (garage.containsKey(carToCheck)) {
            System.out.println("In garage " + carToCheck.toString() + " = " + garage.get(carToCheck).toString() + " cars");
        } else {
            System.out.println("In garage " + carToCheck.toString() + " = " + "0" + " cars");
        }

    }

}
