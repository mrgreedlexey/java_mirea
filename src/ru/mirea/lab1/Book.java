package ru.mirea.lab1;

public class Book {
    private String name;
    private String author;

    public Book (String a, String b)
    {
        name = a;
        author = b;
    }
    public Book (String a)
    {
        name = a;
        author = "Lewis Carroll";
    }
    public Book ()
    {
        name = "Alice in Wonderland";
        author = "Lewis Carroll";
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public void setAuthor (String author)
    {
        this.name = author;
    }
    public String getName(String name){
        return name;
    }
    public String getAuthor(String author){
        return author;
    }
    public String toString(){
        return this.name+", author: "+this.author;
    }

}
