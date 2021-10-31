package com.pb.pereverzev.hw5;

public class Reader {
    String fio;            //- ФИО
    int libraryCardnumber; //- номер читательского билета
    String faculty;        //- факультет
    int dateBirth;         //- дата рождения
    int phone;             //- телефон

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getLibraryCardnumber() {
        return libraryCardnumber;
    }

    public void setLibraryCardnumber(int libraryCardnumber) {
        this.libraryCardnumber = libraryCardnumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(int dateBirth) {
        this.dateBirth = dateBirth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}