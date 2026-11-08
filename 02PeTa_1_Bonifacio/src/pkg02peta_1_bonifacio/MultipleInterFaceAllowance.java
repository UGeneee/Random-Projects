package pkg02peta_1_bonifacio;
// FOR MULTI INTERFACE USE
// FOR MULTI INTERFACE USE
// FOR MULTI INTERFACE USE

import java.util.Scanner;

interface Allowance {

    void dailyAllowance(double allowance);
}

interface IncreaseAllowance {

    void increaseAllowance(double currentAllowance);
}

interface Schedule {

    void semesterPlan();
}

public class MultipleInterFaceAllowance implements Allowance, IncreaseAllowance, Schedule {

    double currentAllowance;

    public void dailyAllowance(double allowance) {
        currentAllowance = allowance;
    }

    public void increaseAllowance(double allowance) {
        currentAllowance = allowance * 1.03;
    }

    public void semesterPlan() {

        int days = 5; // 5 days in a week
        int weeks = 18; // 18 weeks per semester
        int semesters = 6; // given in the instruction

        int daysPerSemester = days * weeks;

        for (int sem = 1; sem <= semesters; sem++) {

            if (sem > 1 && sem % 2 == 0) {
                increaseAllowance(currentAllowance);
            }

            double semesterTotal = currentAllowance * daysPerSemester;

            System.out.println("\nSemester " + sem);
            System.out.println("Daily Allowance: " + currentAllowance);
            System.out.println("Total Allowance this Semester: " + semesterTotal);
        }
    }
}

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MultipleInterFaceAllowance multi = new MultipleInterFaceAllowance();

        System.out.print("Enter daily allowance: ");
        double startAllowance = sc.nextDouble();

        multi.dailyAllowance(startAllowance); // stores the value of startAllowance for semesterPlan() to use
        multi.semesterPlan();

        sc.close();
    }
}