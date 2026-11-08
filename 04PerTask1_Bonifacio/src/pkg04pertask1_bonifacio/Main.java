package pkg04pertask1_bonifacio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("icecream.txt");

            System.out.println("Absolute Path: " + file.getAbsolutePath());

            if (file.exists()) {

                System.out.println("File exists.");

                System.out.println("File Name: " + file.getName());
                System.out.println("Parent Directory: " + file.getParent());
                System.out.println("File Size: " + file.length() + " bytes");

                BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
                System.out.println("Creation Time: " + attr.creationTime());

            } else {

                System.out.println("File does NOT exist.");

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

    }

}