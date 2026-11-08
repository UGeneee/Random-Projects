package bonifacio_06lab1;

import java.util.Scanner;

public class StiCafe {

    public static void main(String[] args) {
        // menu is burger, fries, and milk tea
        // price is 45, 30, 65 respectively
        // ask the user to enter the menu number and quantity
        // use switch statement to determine price per item
        // add a computation for the final bill
        // if total bill == 100 then free iced tea worth 20 pesos

        Scanner sc = new Scanner(System.in);
        float burgerPrice = 45.0f;
        float friesPrice = 30.0f;
        float milkTeaPrice = 65.0f;
        String freeIcedTea = "Iced Tea";
        float totalAmount = 0.0f;
        String itemName = "";
        byte menuItem;
        int qty;

        System.out.println("Hello! Welcome to STI Cafe!");
        System.out.println("What would you like to order?");
        System.out.println("(1) Burger (Php45) \n(2) Fries (Php30) \n(3) Milk Tea (Php65)");
        menuItem = sc.nextByte();

        System.out.print("How much would you like to buy? ");
        qty = sc.nextInt();
        sc.nextLine();

        switch (menuItem) {
            case 1:
                itemName = "Burger";
                System.out.println("You've selected: Burger | Php" + burgerPrice);
                totalAmount = burgerPrice * qty;
                break;
            case 2:
                itemName = "Burger";
                System.out.println("You've selected: Fries | Php" + friesPrice);
                totalAmount = friesPrice * qty;
                break;
            case 3:
                itemName = "Burger";
                System.out.println("You've selected: Milk Tea | Php" + milkTeaPrice);
                totalAmount = milkTeaPrice * qty;
                break;
            default:
                System.out.println("Invalid menu item.");
                return;
        }

        System.out.println("Your total bill is: Php" + totalAmount);

        if (totalAmount >= 100) {
            System.out.println("Because your order is above Php100, you get a free " + freeIcedTea);
        }

        System.out.println("Thank you for buying at STI Cafe!");
    }

}
