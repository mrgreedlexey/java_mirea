package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("1984", "Orwell");
        Book b2 = new Book();
        Book b3 = new Book("Barmaglot");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        }
    }
