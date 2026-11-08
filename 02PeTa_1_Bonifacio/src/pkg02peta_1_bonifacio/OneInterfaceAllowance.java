package pkg02peta_1_bonifacio;
// FOR SINGLE INTERFACE USE
// FOR SINGLE INTERFACE USE
// FOR SINGLE INTERFACE USE

import java.util.Scanner;

interface CalcuAllowance {

    void computeAllowance(double dailyAllowance, int numDays);
}

class DailyAllowance implements CalcuAllowance {

    public void computeAllowance(double dailyAllowance, int numDays) {
        double total = dailyAllowance * numDays;
        String currentDate = "February 16, 2026";

        System.out.println("Daily Allowance: " + dailyAllowance);
        System.out.println("Today is: " + currentDate);
        System.out.println("Number of days left until April 30: " + numDays);
        System.out.println("Total Allowance until April: " + total);
    }
}

class OneInterfaceAllowance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DailyAllowance allowance = new DailyAllowance();

        System.out.print("My Daily Allowance: ");
        double dailyAllowance = sc.nextDouble();
        System.out.println("");

        int numDays = 73; // 73 days before April 30

        allowance.computeAllowance(dailyAllowance, numDays);

    }
}
