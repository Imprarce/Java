package ru.mirea.lab1;

public class Book {
    private String author;
    private String name;
    public Book(String a, String n){
        author = a;
        name = n;
    }

    public Book(){
        author = "";
        name = "";
    }

    public Book(String a)
    {
        author = a;
        name = "";
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
    return "author: "+this.author + ", name: " +this.name;
    }
}
