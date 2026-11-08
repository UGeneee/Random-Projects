package pkg03labexer1_bonifacio;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // 1. ArithmeticException
            System.out.println("Divide a Number");
            System.out.print("Please enter the first number: ");
            int num1 = sc.nextInt();
            System.out.print("Please enter the second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Detected. ");
            System.out.println("Error: You've inputted an invalid number to be divided.");
        } finally {
            System.out.println("End of ArithmeticException test.");
        }

        try {
            // 2. InputMismatchException
            System.out.println("");
            System.out.println("Whole Number");
            System.out.print("Please enter a whole number: ");
            int wholeNum = sc.nextInt();

            System.out.println("You entered: " + wholeNum);

        } catch (InputMismatchException e) { // Please note: if this is answered incorrectly
                                             // the code won't run the next try-catch block.
            System.out.println("InputMismatchException Detected.");
            System.out.println("Error: You've entered an invalid input.");
        } finally {
            System.out.println("End of InputMismatchException test.");
        }

        try {
            // 3. ArrayIndexOutOfBoundsException
            System.out.println("");
            System.out.println("Array");

            int[] numbers = {10, 20, 30, 40, 50};

            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Value: " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Detected.");
            System.out.println("Error: You've entered an invalid array index.");
        } finally {
            System.out.println("End of InputMismatchException test.");
        }
    }

}
