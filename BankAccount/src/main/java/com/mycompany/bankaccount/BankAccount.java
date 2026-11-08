package com.mycompany.bankaccount;

import java.util.Scanner;

public class BankAccount {

    private String accountName;

    private long accountNumber;

    private double accountBalance;

    // Constructor
    public BankAccount(String name, long number, double balance) {

        this.accountName = name;

        this.accountNumber = number;

        this.accountBalance = balance;

    }

    public void display() {

        System.out.println("Name: " + accountName);

        System.out.println("Account: " + accountNumber);

        System.out.printf("Balance: %.2f%n", accountBalance);

    }

    public double deposit(double amount) {

        if (amount <= 0) {

            System.out.println("Deposit amount must be greater than zero.");

        } else {

            accountBalance += amount;

            System.out.printf("Deposit successful. New balance: %.2f%n",
                    accountBalance);

        }

        return accountBalance;

    }

    public double withdraw(double amount) {

        if (amount <= 0) {

            System.out.println("Withdrawal amount must be greater than zero.");

        } else if (amount > accountBalance) {

            System.out.println("Insufficient balance.");

        } else {

            accountBalance -= amount;

            System.out.printf("Withdrawal successful. New balance: %.2f%n",
                    accountBalance);

        }

        return accountBalance;

    }

    public double getBalance() {

        return accountBalance;

    }

    public static void transact(BankAccount user, Scanner scanner) {

        boolean running = true;

        while (running) {

            System.out.println("\nWelcome to Union Bank");

            System.out.println("What would you like to do?");

            System.out.println("[V] - View Account");

            System.out.println("[W] - Withdraw");

            System.out.println("[D] - Deposit");

            System.out.println("[E] - Exit");

            System.out.print("Enter your choice: ");

            String action = scanner.nextLine().trim().toUpperCase();

            switch (action) {

                case "V":

                    user.display();

                    break;

                case "W":

                    System.out.print(
                            "How much money would you like to withdraw? "
                    );

                    try {

                        double amount = Double.parseDouble(
                                scanner.nextLine()
                        );

                        user.withdraw(amount);

                    } catch (NumberFormatException exception) {

                        System.out.println("Please enter a valid amount.");

                    }

                    break;

                case "D":

                    System.out.print(
                            "How much money would you like to deposit? "
                    );

                    try {

                        double amount = Double.parseDouble(
                                scanner.nextLine()
                        );

                        user.deposit(amount);

                    } catch (NumberFormatException exception) {

                        System.out.println("Please enter a valid amount.");

                    }

                    break;

                case "E":

                    System.out.println("Goodbye!");

                    running = false;

                    break;

                default:

                    System.out.println("Invalid input.");

            }

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BankAccount user = new BankAccount(
                "John",
                123456789L,
                0.00
        );

        transact(user, scanner);

        scanner.close();

    }

}
