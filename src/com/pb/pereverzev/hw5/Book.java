package com.pb.pereverzev.hw5;

public class Book {
        String name;        //название
        String autorBook;   //автор книги
        int yearPublishing; // год издания

        public String getName(String name) {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAutorBook(String AutorBook) {
                return autorBook;
        }

        public void setAutorBook(String autorBook) {
                this.autorBook = autorBook;
        }

        public int getYearPublishing(Integer getYearPublishing) {
                return yearPublishing;
        }

        public void setYearPublishing(int yearPublishing) {
                this.yearPublishing = yearPublishing;
        }
/*
Имеет перегруженные методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг.
Выводит на консоль сообщение
"Петров В. В. взял 3 книги".
 */

}
