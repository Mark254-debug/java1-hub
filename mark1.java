/*
AUTHOR: MARK MAINA 
REG NO: CT101/G/19284/23
DATE: 23/01/2025
A PROGRAM TO CALCULATE EMPLOYEE BONUS
 */
//From Java utilities, we import the scanner module which will be used to accept input

import java.util.Scanner;
public class Sum {
    public static void main(String[] args)
    {
        // here we are declaring a type or called scanner which will be the new name of the module
        //in the function we pass the system input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter The First  Value: "); // prompt
        int x = scanner.nextInt(); // input is assigned to the variable x
        
        System.out.print("Enter The Second  Value: ");// prompt
        int y = scanner.nextInt();// input is assigned to the variable y
        
        int sum = x + y; // assignig and declaration of sum. addition takes place
        
        System.out.print("The Sum Is: " + sum); //Final output
        
        scanner.close(); // the function closes the opened scanner
        
    }
}
