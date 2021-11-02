package com.pb.pereverzev.hw5;

import static com.pb.pereverzev.hw5.Book.getCountBooks;
//import static com.pb.pereverzev.hw5.Reader.getCountReaders;

public class Library {
    public static void main(String[] args) {
        Book book0 = new Book("Приключения","Иванов И.И.",2000);
        Book book1 = new Book("Словарь","Сидоров А.В.",1980);
        Book book2 = new Book("Энциклопедия","Гусев К.В.",2010);

        Reader reader1 = new Reader("Петров В.В.","qwe1234");

        System.out.println("Всего в библиотеке "+getCountBooks()+" книг:");
        book0.getInfo();
        book1.getInfo();
        book2.getInfo();
        System.out.println("[+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++]");
        System.out.println("Всего в библиотеке зарегистрировано -1");//+getCountReaders()+" читателей:");
        reader1.getInfo();
        System.out.println("[+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++]");
        reader1.takeBook(3);
        reader1.takeBook(book1.getBookName(), book2.getBookName(),book0.getBookName());
        reader1.takeBook(book1,book2);
        System.out.println("[+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++]");
        reader1.returnBook(3);
        reader1.returnBook(book1.getBookName(), book2.getBookName(), book0.getBookName());
        reader1.returnBook(book1,book2,book0);
    }
}