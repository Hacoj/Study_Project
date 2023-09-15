package lesson.warpper_.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = {new Book("红楼梦", 100),
        new Book("禁书", 90),
        new Book("青年文摘",5),
        new Book("Java从入门到放弃", 300)};
        //从大到小排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.price - o2.price;
            }
        });

        for(int i = 0; i < books.length; i++)
        {
            System.out.println(books[i].name + "  " + books[i].price);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.price - o1.price;
            }
        });

        for(int i = 0; i < books.length; i++)
        {
            System.out.println(books[i].name + "  " + books[i].price);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.name.length() - o2.name.length();
            }
        });

        for(int i = 0; i < books.length; i++)
        {
            System.out.println(books[i].name + "  " + books[i].price);
        }
    }
}

class Book
{
    public String name;
    public int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
