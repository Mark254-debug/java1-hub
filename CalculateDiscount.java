public class CalculateDiscount {  // Corrected class name (PascalCase)

    public static double getDiscount(double amount) {  // Corrected method signature
        double discount = 0.0;  // Declare and initialize the discount variable

        if (amount > 5000) {  // Corrected if condition syntax
            discount = 0.1 * amount;  // Corrected discount calculation
        } else if (amount > 1000 && amount <= 5000) { // Corrected else if condition syntax
            discount = 0.05 * amount;  // Corrected discount calculation
        }

        return discount;  // Return the calculated discount
    }

    public static void main(String[] args) {  // Corrected main method signature
        double discount = getDiscount(7000);  // Calling the method and storing result
        System.out.println(discount);  // Corrected output statement
    }
}