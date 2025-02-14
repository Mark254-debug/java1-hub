
import java.util.Scanner;

// Base class Vehicle
class Vehicle {
    // Fields
    private String brand;
    private String model;
    private int year;

    // Constructor to initialize fields
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

// Subclass Car that inherits from Vehicle
class Car extends Vehicle {
    // Additional field
    private String fuelType;

    // Constructor to initialize all fields including those from Vehicle
    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year); // Call the constructor of Vehicle
        this.fuelType = fuelType;
    }

    // Overriding displayDetails method to include fuelType
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Class Showroom to interact with the user
public class Showroom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter the fuel type of the car: ");
        String fuelType = scanner.nextLine();

        // Instantiate a Car object using user-provided data
        Car car = new Car(brand, model, year, fuelType);

        // Call displayDetails method to show car's details
        car.displayDetails();

        // Close scanner resource
        scanner.close();
    }
}