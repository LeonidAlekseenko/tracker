package ru.job4j.elementary.pojo;

import static java.lang.System.*;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Clean code", 0);
        Book two = new Book("two", 19);
        Book three = new Book("three", 678);
        Book four = new Book("four", 789);
        Book[] arrays = new Book[4];
        arrays[0] = one;
        arrays[1] = two;
        arrays[2] = three;
        arrays[3] = four;

        for (Book books : arrays) {
            out.println(books.getName() + " - " + books.getPages());
        }

        Book tmp = arrays[0];
        arrays[0] = arrays[3];
        arrays[3] = tmp;

        for (Book books : arrays) {
            out.println(books.getName() + " - " + books.getPages());
        }

        for (Book books : arrays) {
            if ("Clean code".equals(books.getName())) {
                System.out.println(books.getName() + " - " + books.getPages());
            }
        }
    }
}
