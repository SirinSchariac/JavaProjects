package Project1.pkg.basic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
         try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Please input the baby's name: ");
             String babyName = myScanner.nextLine();

             System.out.println("Please input the baby's ID: ");
             int babyID = myScanner.nextInt();

            System.out.println("The baby's name is " + babyName + ".\nThe baby's ID is " + babyID + ".");
        }
    }
}

