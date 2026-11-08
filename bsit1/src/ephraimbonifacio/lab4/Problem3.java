/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephraimbonifacio.lab4;

/**
 *
 * @author Acer
 */
public class Problem3 {
    public static void main(String []args) {
        /* Problem 3: You are now a successful data analyst at Oracle Philippines receiving
        Php 540,000.00 per year. How much will be your daily earning? If you were late for 5 minutes, how much will be
        your deduction? */
     
     // yearly salary = 540,000.00
     // IF 5 mins late how much deduction
     // total earnings = ?
     // total deduction PER day = ?

     float yearlySalary = 540000.00f;
     float lateDeductionPerMin = 500.00f;
     byte workingDays = 20; 
     byte monthsInYear = 12;
     
     int totalWorkingDaysInYear = workingDays * monthsInYear;
     
     boolean isLate = false;
     
     float dailyEarnings = yearlySalary / totalWorkingDaysInYear;
     float deductionLate;
     
     if (isLate == true) {
         deductionLate = dailyEarnings - lateDeductionPerMin; 
         System.out.println("My Daily Earnins with 5 mins deduction is: " + deductionLate + " pesos"); // 1179.452
         System.out.println("My Deduction is: " + lateDeductionPerMin + " pesos"); // 300 from 1 sec = 1 peso deduction
     } else {
         System.out.println("My Daily Earnings is: " + dailyEarnings + " pesos"); // 1479.452
     }
     
     System.out.println("");

    }
}
