package bonifacio_06lab1;

import java.util.Scanner;

public class TravelFair {

    public static void main(String[] args) {
        // Calculate how much a passenger should pay
        // ask if the passenger is a student
        // student has a 20% discount
        // lets say the regular fair is 130

        Scanner sc = new Scanner(System.in);
        String isStudent;
        String hasId;

        float regularFair;
        float discount = 0.2f;

        System.out.println("Hello, what is the regular fair?");
        regularFair = sc.nextFloat(); sc.nextLine();
        System.out.println("Hello! our regular fair is "+regularFair);

        System.out.println("We have a 20% discount for students");
        System.out.println("Are you a student? Y/N");
        isStudent = sc.nextLine();

        if (isStudent.equalsIgnoreCase("y") || isStudent.equalsIgnoreCase("yes")) {
            System.out.println("Do you have your ID? Y/N");
            hasId = sc.nextLine();

            if (hasId.equalsIgnoreCase("n") || hasId.equalsIgnoreCase("no")) {
                System.out.println("Your travel fee is: Php" + regularFair);
            } else {
                float appliedDiscount = regularFair * discount;
                float totalFair = regularFair - appliedDiscount;
                System.out.println("Your travel fair is: Php" + totalFair);
            }

        } else {
            System.out.println("Your travel fair is: Php"+regularFair);
        }

    }

}
