/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ephraimbonifacio.lab4;

/**
 *
 * @author Acer
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
     /* Problem 1: You just recently got hired as junior Unity engine game developer. You will be receiving 1700 pesos
        food allowance per week with free lunch and accommodation. Your daily salary is 1417.50 pesos. Write a
        program that will calculate how much will be your total monthly salary. */
     
     // daily salary = 1417.50
     // weekly allowance = 1700
     // working days = 26
     // monthly salary = ?
     
     float dailySalary = 1417.50f;
     byte workingDays = 20;
     
     float weeklyAllowance = 1700f;
     byte weeks = 4;
     
     float monthlyAllowance = weeklyAllowance * weeks;
     float monthlySalary = dailySalary * workingDays;
     
     float totalMoney = monthlySalary + monthlyAllowance;
     
     System.out.println("My Monthly Salary is: " + totalMoney + " pesos");
     
    }
    
}
