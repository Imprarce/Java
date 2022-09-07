package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Mike", 2, "Test1");
        Book d2 = new Book("Helen", 7, "Test2");
        Book d3 = new Book("Bob");
        d3.setYears(1);
        d3.setName("Test3");
        System.out.println(d3);
    }
}
