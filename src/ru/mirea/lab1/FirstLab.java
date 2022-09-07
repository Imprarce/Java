package ru.mirea.lab1;

public class FirstLab {
    private int[] numbers = new int[10];
    private int sum;

    public FirstLab()
    {
        sum = 0;
    }

    public void massive()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = i;
        }
    }

    public void metodFor()
    {
        for (int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
        }
    }

    public void metodWhileFirst()
    {
        int i = 0;
        sum = 0;
        while (i < 10)
        {
            sum += numbers[i];
            i++;
        }
    }

    public void metodWhileSecond()
    {
        int i = 0;
        sum = 0;
        do{
            sum += numbers[i];
            i++;
        }while(i < 10);
    }

    public String toString()
    {
        return "Sum = " + sum;
    }

}
