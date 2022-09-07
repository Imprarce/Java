package ru.mirea.lab1;

public class Book {
    private String author;
    private int years;
    private String name;
    public Book(String a, int y, String n){
        author = a;
        years = y;
        name = n;
    }

    public Book(String a){
        author = a;
        years = 0;
        name = "";
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYears(int years)
    {
        this.years = years;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
    return "author: "+this.author + ", years: "+this.years + ", name: " +this.name;
    }
}
