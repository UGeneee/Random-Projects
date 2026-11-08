package demooo;

import java.util.Scanner;

public class Demooo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Problem 1 = Odd or Even
        int num = 0;
        
        System.out.print("Enter a number and I will determine if its an Odd number or Even number: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        // Problem 2 = Positiv, Negative, or Zero
        int num1;

        System.out.print("Enter a number and I will determine if its positive, negative, or zero: ");
        num1 = sc.nextInt();

        if (num1 > 0) {
            System.out.println("The number is positive.");
        } else if (num1 < 0) {
            System.out.println("The number is negative.");
        } else if (num1 == 0) {
            System.out.println("The number is zero");
        }

        // Problem 3 = Simple Calculator
        int total;
        
        System.out.println("Welcome to my basic calculator.");
        System.out.println("Please choose an operator: (+, -, *, /)");
        String operator = sc.nextLine();
        
        System.out.print("Please enter first number: ");
        int calNum1 = sc.nextInt();
        System.out.print("Please enter second number: ");
        int calNum2 = sc.nextInt();
        
        if (operator == "+") {
            total = calNum1 + calNum2;
            System.out.println("The output is: " + total);
        } else if (operator == "-") {
            total = calNum1 - calNum2;
            System.out.println("The output is: " + total);
        } else if (operator == "*") {
            total = calNum1 * calNum2;
            System.out.println("The output is: " + total);
        } else if (operator == "/") {
            total = calNum1 / calNum2;
            System.out.println("The output is: " + total);
        } else {
            System.out.println("Please follow the instruction");
        }
    }

}
