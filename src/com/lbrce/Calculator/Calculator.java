package com.lbrce.Calculator;

public class Calculator {
    public static void main(String[] args) {
        // Define two numbers
        double num1 = 10;
        double num2 = 5;

        // Perform and display all operations
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);

        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = (num2 != 0) ? num1 / num2 : Double.NaN; // Handle division by zero

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Error (Division by zero is not allowed)");
        }
    }
}
