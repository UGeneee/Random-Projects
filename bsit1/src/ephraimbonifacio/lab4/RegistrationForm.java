package ephraimbonifacio.lab4;
import java.util.Scanner;

public class RegistrationForm {
     public static void main(String[] args) {
      
         // Task: Make a registration form for school purposes

         // Instantation
         Scanner sc = new Scanner(System.in);
         String teamName;
         String teamCap;
         byte teamQty;
         String ign1, ign2, ign3, ign4, ign5;
         String reserve;

         System.out.println("====== Mobile Legend Team Registration ======");
         System.out.print("Enter Team Name: ");
         teamName = sc.nextLine();

         System.out.print("Enter Team Captain: ");
         teamCap = sc.nextLine();
         
         System.out.print("How Many Team Members? (Min 5 and Max of 6): ");
         teamQty = sc.nextByte(); sc.nextLine();
         
         if (teamQty >= 6) {
         System.out.print("Enter Member 1 IGN: ");
         ign1 = sc.nextLine();
         
         System.out.print("Enter Member 2 IGN: ");
         ign2 = sc.nextLine();
         
         System.out.print("Enter Member 3 IGN: ");
         ign3 = sc.nextLine();
         
         System.out.print("Enter Member 4 IGN: ");
         ign4 = sc.nextLine();
         
         System.out.print("Enter Member 5 IGN: ");
         ign5 = sc.nextLine();
         
         System.out.print("Enter Reserve Member IGN: ");
         reserve = sc.nextLine();
         
         System.out.println("=============================================");
         
         System.out.println("");
         
         System.out.println("## Team Details ##");
         System.out.println("Team Name: " + teamName);
         System.out.println("Team Captain: " + teamCap);
         System.out.println("Team Members: ");
         System.out.println("(1) " + ign1);
         System.out.println("(2) " + ign2);
         System.out.println("(3) " + ign3);
         System.out.println("(4) " + ign4);
         System.out.println("(5) " + ign5);
         System.out.println("(6) Team Reserve: " + reserve + "\n");
         System.out.println("=============================================");
         
         System.out.println("Goodluck players! GLHF!");
             
         } else if (teamQty <= 5) {
             System.out.print("Enter Member 1 IGN: ");
             ign1 = sc.nextLine();

             System.out.print("Enter Member 2 IGN: ");
             ign2 = sc.nextLine();

             System.out.print("Enter Member 3 IGN: ");
             ign3 = sc.nextLine();

             System.out.print("Enter Member 4 IGN: ");
             ign4 = sc.nextLine();

             System.out.print("Enter Member 5 IGN: ");
             ign5 = sc.nextLine();
             
            System.out.println("=============================================");

            System.out.println("");

            System.out.println("Team Details");
            System.out.println("Team Name: " + teamName);
            System.out.println("Team Captain: " + teamCap);
            System.out.println("Team Members: ");
            System.out.println("(1) " + ign1);
            System.out.println("(2) " + ign2);
            System.out.println("(3) " + ign3);
            System.out.println("(4) " + ign4);
            System.out.println("(5) " + ign5);
            System.out.println("Team Reserve: None \n");
            System.out.println("=============================================");

            System.out.println("Goodluck players! GLHF!");
             
         }

    }
}
