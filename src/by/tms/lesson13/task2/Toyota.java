package by.tms.lesson13.task2;

public class Toyota extends Car {


    public Toyota() {
    }

    public Toyota(String brand, String model, int year, int mileage, boolean isElectric) {
        super(brand, model, year, mileage, isElectric);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
