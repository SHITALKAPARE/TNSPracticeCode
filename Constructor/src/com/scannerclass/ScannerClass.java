package com.scannerclass;
import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume leftover newline from nextInt()

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads full name with spaces

        System.out.println("ID = " + id);
        System.out.println("Name = " + name);

        sc.close();
    }
}
