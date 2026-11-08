package com.mycompany.lab1_eeb;

import java.util.Scanner;

public class ThreadsProgram {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        try {
            System.out.print("Name your first thread: ");
            String thread1 = scn.nextLine();

            System.out.print("Name your second thread: ");
            String thread2 = scn.nextLine();

            ThreadDemo t1 = new ThreadDemo(thread1);
            ThreadDemo t2 = new ThreadDemo(thread2);

            Thread.currentThread().sleep(500);
            System.out.println(thread1 + " is " + t1.getState());
            Thread.currentThread().sleep(500);
            System.out.println(thread2 + " is " + t2.getState());

            System.out.println("\nStarting the threads...");

            
            t1.start();
            t2.start();
            Thread.currentThread().sleep(500);

            System.out.println("\nAfter sleep...");

            Thread.currentThread().sleep(500);
            System.out.println(thread1 + " is " + t1.getState());
            Thread.currentThread().sleep(500);
            System.out.println(thread2 + " is " + t2.getState());

        } catch (InterruptedException e) {

            System.out.println(e);
        }
    }
}

class ThreadDemo extends Thread {

    public ThreadDemo(String name) {

        super(name);
    }

    public void run() {

        System.out.println(
                getName() + " is " + Thread.currentThread().getState()
        );
    }
}
