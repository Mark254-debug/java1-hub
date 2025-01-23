/*
Name: MARK MAINA
Reg No: CT101/G/19284/23
Date: 23/01/2025
Sum of two values
Assignment 3
 */

 import java.util.Scanner; //import the scanner

 public class Sum{
     public static void main(String[]args){
         Scanner myOBJ= new Scanner(System.in);
 
         //user inputs first value
         System.out.print("Enter first value: ");
         double number1 = myOBJ.nextDouble();
 
         //user inputs second value
         System.out.print("Enter second value: ");
         double number2 = myOBJ.nextDouble();
 
         //initialize sum to add the two numbers
         double sum;
         sum=number1+number2;
 
         //print out the sum if the two numbers
         System.out.println("The sum is: " + sum);
 
         //close scanner
         myOBJ.close();
     }
 }
