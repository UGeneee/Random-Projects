package dec04_fflab;

import java.util.Scanner;
import java.util.Arrays;

public class Dec04_FFLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Problem 1
//        int price = 0;
//        int total = 0;
//        int cash = 0;
//        
//        System.out.println("Welcome to Gaisano Capitol");
//        
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Please enter product name: ");
//            String product = sc.nextLine();
//            System.out.println("Enter price for " + product);
//            price = sc.nextInt(); sc.nextLine();
//            
//            total += price;
//        }
//        System.out.println("Total: " + total);
//        System.out.print("Enter cash amount: ");
//        cash = sc.nextInt();
//        
//        int amount = cash - total;
//        
//        System.out.println("Change: " + amount);
        
        // Problem 2
//        int repeat = 0;
//        
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.print("Enter a number: ");
//        repeat = sc.nextInt();
//        
//        for (int i = 0; i < repeat; i++) {
//            System.out.println(name);
//            
//        }

        // Problem 3  
//        int width = 0;
//        int length = 0;
//        
//        System.out.println("Please enter the width for a rectangle");
//        width = sc.nextInt();
//        System.out.println("Please enter the length for the rectangle");
//        length = sc.nextInt();
//        
//        int area = width * length;
//        
//        System.out.println("The area is: " + area);

        // Problem 4
//           String basket[] = new String[5];
//           String fruits = "";
//           
//           for (int i = 0; i < 5; i++) {
//               System.out.println("Enter a fruit: ");
//               basket[i] = sc.nextLine();
//               
//               fruits += basket[i] + " ";
//           }
//           
//           System.out.println("Here is your basket of fruits: ");
//           System.out.println(fruits);

        // Problem 5
        int tableNum;
        
        System.out.println("Welcome to multiplication table automaker!");
        System.out.print("Please enter a number you want to have an automated 1-10 table: ");
        tableNum = sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
            int output = tableNum * (i + 1);
            System.out.println(tableNum + " x " + (i + 1) + " = " + output);
        }
    }
}
