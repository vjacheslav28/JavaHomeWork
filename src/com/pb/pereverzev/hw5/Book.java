package com.pb.pereverzev.hw5;

public class Book {
        //подсчет кол-ва книг
        private static int countBooks = 0;

        public static int getCountBooks() {
                return countBooks;
        }
        private String bookName;    //название
        private String autorBook;   //автор книги
        private int yearPublishing; // год издания
//
        public Book(String bookName, String autorBook) {
                this.bookName = bookName;
                this.autorBook = autorBook;
                //this.yearPublishing = yearPublishing;
                countBooks++;
        }
        public Book(String bookName, String autorBook, int yearPublishing) {
                this.bookName = bookName; //+countBooks;
                this.autorBook = autorBook;// +countBooks;
                this.yearPublishing = yearPublishing;
                countBooks++;

        }

        public String getBookName() {
                return bookName;
        }

        public String getBookAuthor() {
                return autorBook;
        }

        public int getBookYear() {
                return yearPublishing;
        }

        /*
          Выводим информированицию о состоянии объекта - книги.
         */
        public void getInfo(){
                System.out.println("Книгу \""+ bookName +"\" написал "+autorBook+" в "+yearPublishing+" году.");
        }

}
