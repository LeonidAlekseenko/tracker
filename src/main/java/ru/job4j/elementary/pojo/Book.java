package ru.job4j.elementary.pojo;

public class Book {
    private String name;
    private int pages;

     public Book(String name, int pages) {
         this.name = name;
         this.pages = pages;
     }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }
}
