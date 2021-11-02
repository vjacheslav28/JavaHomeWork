package com.pb.pereverzev.hw5;

import java.lang.StringBuilder;

public class Reader {
    //обьявление полей
    private String readerName;
    private String readerBilNum;
    private String readerDep;
    private String readerBirth;
    private String readerPhone;

    public Reader(String readerName,String readerBilNum,String readerDep,String readerBirth,String readerPhone) {
        this(readerName,readerBilNum);
        this.readerDep = readerDep;
        this.readerBirth = readerBirth;
        this.readerPhone = readerPhone;
    }
//Информация о читателе
    public Reader(String readerName,String readerBilNum) {
        this.readerName = readerName;
        this.readerBilNum = readerBilNum;
        this.readerDep = "vip";
        this.readerBirth = "17012021";
        this.readerPhone = "09598989898";
        //countReaders++;
    }

    public String getReaderName() {
        return readerName;
    }

    public String getReaderBilNum() {
        return readerBilNum;
    }

    public String getReaderDep() {
        return readerDep;
    }

    public String getReaderBirth() {
        return readerBirth;
    }

    public String getReaderPhone() {
        return readerPhone;
    }
     //информирования состоянии обекта - читателя.
    public void getInfo() {
        System.out.println("--**************************************************--"+'\n'
                +"[ФИО читателя: "+readerName+ "]"+'\n'
                +"[№ читательского билета: "+readerBilNum+ "]"+'\n'
                +"[Факультет читателя: "+readerDep+ "]"+'\n'
                +"[Дата рождения читателя: "+readerBirth+ "]"+'\n'
                +"[Номер телефона читателя: "+readerPhone+ "]"+'\n');
    }
//
    public void takeBook(int countBook) {
        System.out.println("Студент "+this.readerName+" взял "+countBook+" книги.");
    }

    // наименование взятых книг
    public void takeBook(String... booksName) {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append("Студент "+this.readerName+" взял книги: ");
        for(String bookName : booksName) {
            strBldr.append(bookName);
            strBldr.append(", ");
        }
        String txt = strBldr.substring(0,strBldr.length()-2);
        System.out.println(txt+".");
    }

    // какие книги взял студент
    public void takeBook(Book... books) {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append("Студент "+this.readerName+" взял книги: ");
        for(Book bookObject : books) {
            strBldr.append(bookObject.getBookName());
            strBldr.append(" (");
            strBldr.append(bookObject.getBookAuthor());
            strBldr.append(" ");
            strBldr.append(bookObject.getBookYear());
            strBldr.append(" г.), ");
        }
        String txt = strBldr.substring(0,strBldr.length()-2);
        System.out.println(txt+".");
    }

    //сколько студент вернул книг
    public void returnBook(int countBook) {
        System.out.println("Студент "+this.readerName+" вернул "+countBook+" книг.");
    }
//какие книги вернлу
    public void returnBook(String... booksName) {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append("Студент "+this.readerName+" вернул книги: ");
        for(String bookname : booksName) {
            strBldr.append(bookname);
            strBldr.append(", ");
        }
        String txt = strBldr.substring(0,strBldr.length()-2);
        System.out.println(txt+".");
    }

    // расчитываем возврат книг студентом
    public void returnBook(Book... books) {
        StringBuilder strBldr = new StringBuilder();
        strBldr.append("Студент "+this.readerName+" вернул книги: ");
        for(Book bookObject : books) {
            strBldr.append(bookObject.getBookName());
            strBldr.append(" (");
            strBldr.append(bookObject.getBookAuthor());
            strBldr.append(" ");
            strBldr.append(bookObject.getBookYear());
            strBldr.append(" г.), ");
        }
        // подробное описание автора и название книг
        String txt = strBldr.substring(0,strBldr.length()-2);
        System.out.println(txt+".");
    }

}