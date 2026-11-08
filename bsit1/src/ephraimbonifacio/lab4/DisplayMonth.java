package ephraimbonifacio.lab4;

import java.util.Scanner;

public class DisplayMonth {

    public static void main(String[] args) {
        // problem 2
        // get a numeric number from the user
        // display the months name

        Scanner sc = new Scanner(System.in);

        byte randomNum = 0;

        System.out.print("Please enter a number between 1-12: ");
        randomNum = sc.nextByte();

        switch (randomNum) {
            case 1:
                System.out.println("The month is January");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            case 4:
                System.out.println("The month is April");
                break;
            case 5:
                System.out.println("The month is May");
                break;
            case 6:
                System.out.println("The month is June");
                break;
            case 7:
                System.out.println("The month is July");
                break;
            case 8:
                System.out.println("The month is August");
                break;
            case 9:
                System.out.println("The month is September");
                break;
            case 10:
                System.out.println("The month is October");
                break;
            case 11:
                System.out.println("The month is November");
                break;
            case 12:
                System.out.println("The month is December");
                break;
            default:
                System.out.println("Please only enter a number from 1-12");
        }

    }
}
