package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Mike", "Test1");
        Book d2 = new Book("Helen", "Test2");
        Book d3 = new Book("Bob");
        Book d4 = new Book();
        d3.setName("Test3");

        d4.setName("Test4");
        d4.setAuthor("Luke");

        System.out.println(d4);
    }
}
