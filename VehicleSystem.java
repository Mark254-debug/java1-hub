class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Accelerating by " + increase + ". New speed: " + speed);
    }

    public void brake(int decrease) {
        speed -= decrease;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Braking by " + decrease + ". New speed: " + speed);
    }

    public void showDetails() {
        System.out.println("This is a generic vehicle.");
    }
}

// 2. Subclass: Car
class Car extends Vehicle {
    private int fuelLevel;

    public Car(String brand, int speed, int fuelLevel) {
        super(brand, speed);
        this.fuelLevel = fuelLevel;
    }

    public void refuel(int amount) {
        fuelLevel += amount;
        if (fuelLevel > 100) {
            fuelLevel = 100;
        }
        System.out.println("Refueling by " + amount + "%. New fuel level: " + fuelLevel + "%");
    }

    @Override
    public void showDetails() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + ", Fuel level: " + fuelLevel + "%");
    }
}

// 3. Subclass: Bike
class Bike extends Vehicle {
    private boolean helmetOn;

    public Bike(String brand, int speed, boolean helmetOn) {
        super(brand, speed);
        this.helmetOn = helmetOn;
    }

    public void wearHelmet() {
        helmetOn = true;
        System.out.println("Wearing helmet.");
    }

    @Override
    public void showDetails() {
        System.out.println("Bike brand: " + brand + ", Speed: " + speed + ", Helmet on: " + helmetOn);
    }
}

// 4. Demonstration class
public class VehicleSystem {
    public static void main(String[] args) {
        // Instantiate a Car object
        Car myCar = new Car("Toyota", 60, 50);

        // Instantiate a Bike object
        Bike myBike = new Bike("Yamaha", 40, false);

        // Perform actions on the Car
        myCar.accelerate(20);
        myCar.brake(10);
        myCar.refuel(30);
        myCar.showDetails();

        System.out.println();

        // Perform actions on the Bike
        myBike.accelerate(15);
        myBike.wearHelmet();
        myBike.showDetails();
    }
}