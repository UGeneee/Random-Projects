package ephraimbonifacio.lab4;

import java.util.Scanner;

public class ProductAndAverage {
    public static void main(String[] args) {
        // problem 3
        // ask 5 questions that asks for a number
        // output the product and average
        
        Scanner sc = new Scanner(System.in);
        
        int enterNum = 0;
        int product = 1;
        byte repeat = 0;
        int sum = 0;
        
        while (repeat < 5) {
            System.out.print("Enter a number: ");
            enterNum = sc.nextInt();
            product *= enterNum;
            sum += enterNum;
            repeat++;
        }
        
        int average = sum / 5;
        
        System.out.println("The product is: " + product);
        System.out.println("The average is: " + average);

    }
    
}
