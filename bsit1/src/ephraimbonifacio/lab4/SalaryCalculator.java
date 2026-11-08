/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ephraimbonifacio.lab4;

/**
 *
 * @author Acer
 */
public class SalaryCalculator {
    public static void main(String []args) {
        // earns 35,000 monthly
        // earns 1,666.68 daily
        // works for 21 days
        // has 3 leave credits
        /*
        deductions: SSS contribution 4.5%
                    Pag-ibig contribution 200
                    Withholding tax 10%
        
        things to consider: she took a week long vacation
                            late for 30 minutes
                            was late for 2 months for Pag-Ibig contribution
        */
        // basic info
        String employeeName = "Magdalena Leones";
        float monthSalary = 35000f;
        float dailySalary = 1666.67f;
        short workingTime = 480; // 480 = 8 hours, 60 * 8 = 480
        
        // days
        byte workingDays = 21;
        byte leaveCredits = 3;
        
        // deductions
        float sssContribution = 0.045f;
        float pagibigContribution = 200f;
        float tax = 0.10f;
        byte timeLate = 30;       
        
        // vacation deduction
        byte vacationDays = 5;
        int unpaidLeave = vacationDays - leaveCredits;
        float leaveDeduction = unpaidLeave * dailySalary;
        
        // late deduction
        float minuteRate = dailySalary / workingTime;
        float lateDeduction = timeLate * minuteRate;
        
        // deduction computations of SSS, Pag-Ibig, and tax
        float sssDeduction = monthSalary * sssContribution;
        float pagibigDeduction = pagibigContribution * 3; // +1
        float taxDeduction = monthSalary * tax;
        
        // total deduction
        float totalDeduction = leaveDeduction + lateDeduction + sssDeduction + pagibigDeduction + taxDeduction;
        
        float paywithDeduction = monthSalary - totalDeduction;
                
        System.out.println("========== P A Y S L I P ==========");
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: " + monthSalary);
        System.out.println("Working Days: " + workingDays);
        System.out.println("SSS Contribution: " + String.format("%.2f", sssDeduction));
        System.out.println("Pag-Ibig Contribution: " + pagibigDeduction);
        System.out.println("Withholding Tax: " + taxDeduction);
        System.out.println("Leave Deduction: " + leaveDeduction);
        System.out.println("Late Deduction: " + String.format("%.2f", lateDeduction));
        System.out.println("Total Deduction: " + String.format("%.2f", totalDeduction));
        System.out.println("Net pay: " + String.format("%.2f", paywithDeduction)); //25,887.50
        System.out.println("===================================");
           
    }
    
}