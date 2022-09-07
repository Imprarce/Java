package ru.mirea.lab1;

import java.util.Scanner;

public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число = ");
        int i = sc.nextInt();
        int a = 1;
        for (int j = 1; j <= i; j++) {
            a = a * j;
        }
        System.out.println("Факториал = "+a);
    }
}
