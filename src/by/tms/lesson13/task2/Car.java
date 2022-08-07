package by.tms.lesson13.task2;

public abstract class Car {

    String brand;
    String model;
    int year;
    int mileage;
    boolean isElectric;


    public Car() {
    }

    public Car(String brand, String model, int year, int mileage, boolean isElectric) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", isElectric=" + isElectric +
                '}';
    }
}
