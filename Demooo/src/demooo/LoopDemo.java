package demooo;

import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        String name;
        
//        System.out.println("What is your name?");
//        name = sc.nextLine();
        
//        while (n > 5 ) {
//            System.out.println(n +". " + name);
//            n++;
//        }
    
    do {
        System.out.println("WHAT IS UR PEYBORIT FRUIT?!?!");
        name = sc.nextLine();
    }
     while (!name.equals("done")); 

        System.out.println("Program DONE DAW SABI NGA EH DONE");

    }
}