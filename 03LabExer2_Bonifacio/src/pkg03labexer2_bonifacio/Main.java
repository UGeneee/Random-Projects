package pkg03labexer2_bonifacio;

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

            // 2. InputMismatchException
            System.out.println("");
            System.out.println("Whole Number");
            System.out.print("Please enter a whole number: ");
            int wholeNum = sc.nextInt();

            System.out.println("You entered: " + wholeNum);

            // 3. ArrayIndexOutOfBoundsException
            System.out.println("");
            System.out.println("Array");

            int[] numbers = {10, 20, 30, 40, 50};

            System.out.print("Enter an index (0-4): ");
            int index = sc.nextInt();

            System.out.println("Value: " + numbers[index]);

            // 4. IndexOutOfBoundsException
            System.out.println("");
            System.out.println("Character Position");

            String word = "Bounds";

            System.out.print("Enter character position (0-5): ");
            int pos = sc.nextInt();

            System.out.println("Character: " + word.charAt(pos));

            // 5. NoSuchElementException
            System.out.println("");
            System.out.println("No Element");

            Scanner emptyScanner = new Scanner("");

            System.out.println("Attempting to scan an input..");
            String input = emptyScanner.next();

            System.out.println("Input: " + input);

        } catch (ArithmeticException e) { // 1. ArithmeticException
            System.out.println("ArithmeticException Detected. ");
            System.out.println("Error: You've inputted an invalid number to be divided.");
        } catch (InputMismatchException e) { // 2. InputMismatchException
            System.out.println("InputMismatchException Detected.");
            System.out.println("Error: You've entered an invalid input.");
        } catch (ArrayIndexOutOfBoundsException e) { // 3. ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException Detected.");
            System.out.println("Error: You've entered an invalid array index.");
        } catch (IndexOutOfBoundsException e) { // 4. IndexOutOfBoundsException
            System.out.println("IndexOutOfBoundsException Detected.");
            System.out.println("Error: You've entered an invalid position.");
        } catch (NoSuchElementException e) { // 5. NoSuchElementException
            System.out.println("NoSuchElementException Detected.");
            System.out.println("Error: No element found.");
        }
    }

}
