package ru.mirea.lab1;

import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        int[] b = new int[10];
        /* int[] b = {1, 2, 3, 4, 5, 6};*/
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < b.length; i++)
        {
            b[i] = scanner.nextInt();
        }
        int total = 0;
        int max = b[0], min = b[0];
        int i = 0;
        do{
            total += b[i];
            if(b[i] > max)
            {
                max = b[i];
            }
            if(b[i] < min)
            {
                min = b[i];
            }
            i++;
        }while(i < b.length);
        System.out.println("Максимальное число "+ max);
        System.out.println("Минимальное число "+ min);
        System.out.println("Сумма всех чисел массива:"+ total);
    }
}
