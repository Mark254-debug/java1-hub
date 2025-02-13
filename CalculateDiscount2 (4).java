

import java.util.Scanner; // Import the Scanner class

public class CalculateDiscount2 { // Corrected class name

    public static void main(String[] args) { // Corrected method signature and this is where your code should go

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = input.nextDouble();

        // Calculate the discount amount
        double discountAmount = (discountPercentage / 100) * originalPrice;
        System.out.println(discountAmount); // Corrected output statement
        input.close();
    }
}