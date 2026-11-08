package dec3_f.flab;

import java.util.Scanner;

public class Dec3_FFLab {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//      Problem 1
        int total = 0;

        System.out.print("Please enter the amount of subjects you have: ");
        int subj = sc.nextInt();

        for (int i = 0; i < subj; i++) {
            System.out.print("Please enter your grades in any order: ");
            int grades = sc.nextInt();
            total += grades;
        }
        int average = total / subj;

        System.out.println("\nAverage Grade: " + average);

        if (average >= 75) {
            System.out.println("\nYou passed this semester!");
        } else {
            System.out.println("\nYou failed this semester.");
        }

//        // Problem 2
//        int num;
//        int evenCount = 0;
//        int oddCount = 0;
//
//        System.out.println("Please write any number 8 times.");
//        for (int i = 0; i < 8; i++) {
//            System.out.print("Please enter a any number: ");
//            num = sc.nextInt();
//            
//            if (num % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//            
//        }
//        
//        System.out.println("\nTotal Even Numbers: " + evenCount);
//        System.out.println("Total Odd Numbers: " + oddCount);
//        
//

    }

}
