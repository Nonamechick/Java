public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayCarInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car("Toyota", "Corolla", 2020),
            new Car("Honda", "Civic", 2021),
            new Car("Ford", "Focus", 2019)
        };

        for (Car car : cars) {
            car.displayCarInfo();
        }
    }
}
