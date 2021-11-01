package com.pb.pereverzev.hw5;

public class Library {
    public static void main(String[] args){
        Reader reader = new Reader();
        reader.fio = "Петров В. В.";
        Book book1 =new Book();
        Book book2 =new Book();
        Book book3 =new Book();
        book1.setAutorBook("Иванов И. И.");
        book1.setName("Приключения");
        book1.setYearPublishing(2000);
        book2.setAutorBook("Сидоров А. В");
        book2.setName("Словарь");
        book2.setYearPublishing(1980);
        book3.setAutorBook("Гусев К. В.");
        book3.setName("Энциклопедия");
        book3.setYearPublishing(2010);
        //System.out.println(Reader.);

    }
}
