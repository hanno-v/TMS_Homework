package by.tms.lesson13.task2;

//2. Создать абстрактный класс Car, представляющий собой автомобиль.
//Добавить в него поля: марка, модель, год выпуска + несколько своих.
//Создать 4 класса, являющихся наследниками Car.
//Переопределить во всех 3-х классах методы equals(), hashCode() и toString()
//Создать класс Garage, хранящий в себе HashMap автомобилей,
//в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
//Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного вида автомобилей.
//Продемонстрировать работу гаража.

public class MainClass {

    public static void main(String[] args) {

        Toyota toyotaPrius = new Toyota("Toyota", "Prius", 2019, 15200, true);
        Tesla teslaX = new Tesla("Tesla", "X", 2020, 45961, true);
        VW vwPolo = new VW("VW", "Polo", 2012, 160700, false);
        Skoda scodaRapid = new Skoda("Scoda", "Rapid", 2022, 750, false);

        Garage garage = new Garage();

        // park
        garage.parkAuto(toyotaPrius, 11);
        garage.parkAuto(toyotaPrius, 4);
        garage.parkAuto(toyotaPrius, 1);
        garage.parkAuto(teslaX, 4);
        garage.parkAuto(teslaX, 3);
        garage.parkAuto(vwPolo, 52);
        garage.parkAuto(vwPolo, 11);
        garage.parkAuto(scodaRapid, 26);

        // departure
        garage.departureAuto(toyotaPrius, 5);
        garage.departureAuto(toyotaPrius, 2);
        garage.departureAuto(teslaX, 7);
        garage.departureAuto(vwPolo, 42);
        garage.departureAuto(scodaRapid, 1);

        // check
        garage.checkAutoInGarage(toyotaPrius);
        garage.checkAutoInGarage(teslaX);
        garage.checkAutoInGarage(vwPolo);
        garage.checkAutoInGarage(scodaRapid);
    }

}
