package ephraimbonifacio.lab4;

import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        // get user input
        // tells if positive or negative

        Scanner sc = new Scanner(System.in);

        int inputNum = 0;
        String exit = "";

        try {

            do {

                System.out.print("Enter a number either a positive or a negative: ");
                inputNum = sc.nextInt();

                if (inputNum >= 0) {
                    System.out.println("The number " + inputNum + " is a positive number.");
                } else {
                    System.out.println("The number " + inputNum + " is a negative number.");
                }

                System.out.println("Exit? Y/N");
                exit = sc.next(); sc.nextLine();

            } while (!exit.equalsIgnoreCase("Y"));
            System.out.println("Thanks for trying!");
        } catch (Exception e) {
            System.out.println("There is an error.");
        }
    }

}
