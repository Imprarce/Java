package ru.mirea.lab1;

import java.util.Scanner;

public class First {
    public static void main(String[] args){
            int[] b = new int[10];
         /* int[] b = {1, 2, 3, 4, 5, 6};*/
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < b.length; i++)
        {
            b[i] = scanner.nextInt();
        }
        int total = 0;
        float arif = 0f;
        for (int i = 0; i < b.length; i++)
        {
            total += b[i];
            if(i == b.length-1)
            {
                arif = total/2f;
            }
        }
                System.out.println("Среднее арифметическое = "+ arif);
                System.out.println("Сумма всех чисел массива:"+ total);
    }
}
