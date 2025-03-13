public class Car {
    // Private fields
    public static void main(String []args){}
    private String licensePlate; // e.g., 
    private boolean isRented;    // Tracks availability

    // Constructor to set the license plate when a car is created
    public Car(String licensePlate) {
        this.licensePlate = licensePlate;
        this.isRented = false; // Initially, the car is not rented
    }

    // Public method to rent the car (only if it is available)
    public boolean rentCar() {
        if (!isRented) {
            isRented = true; // Mark the car as rented
            return true;     // Successfully rented
        }
        return false;        // Car is already rented
    }

    // Public method to return the car (mark it as available)
    public void returnCar() {
        isRented = false; // Mark the car as available again
    }

    // Getter method to check if the car is rented
    public boolean isRented() {
        return isRented;
    }

    // Optional: Getter for license plate (if needed)
    public String getLicensePlate() {
        return licensePlate;
    }
}

