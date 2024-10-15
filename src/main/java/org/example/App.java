package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Enter two int numbers and get ur result of" +
                " multiplication");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Result: " + a * b);
        calculateSum(a, b);
    }
    private static void calculateSum(int x, int y) {
        System.out.println("Summa: " + (x + y));
    }
}
