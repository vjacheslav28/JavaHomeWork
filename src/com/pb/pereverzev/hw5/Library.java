package com.pb.pereverzev.hw5;

public class Library {
    public static void main(String[] args){
        Reader reader = new Reader();
        reader.fio = "Петров В. В.";
        Book book1 =new Book();
        Book book2 =new Book();
        Book book3 =new Book();
        book1.getAutorBook("Иванов И. И.");
        book1.getName("Приключения");
        book1.getYearPublishing(2000);
        book2.getAutorBook("Сидоров А. В");
        book2.getName("Словарь");
        book2.getYearPublishing(1980);
        book3.getAutorBook("Гусев К. В.");
        book3.getName("Энциклопедия");
        book3.getYearPublishing(2010);
System.out.println("FIO - " + reader.fio);

    }
}
