package com.pb.pereverzev.hw8;
// отображения для не корректного воода пароля
public class WrongPasswordException extends Exception{
    private int symbolCount;

    public WrongPasswordException() {

    }
//для отображенния ввода не допустимых символов
    public WrongPasswordException(String clientMsg) {
        System.out.println(clientMsg);
    }

  //показываем о вводе не допустимое кол-во символов
    public WrongPasswordException(int symbolCount, String clientMsg) {
        this.symbolCount = symbolCount;
        System.out.println(clientMsg + " - " + getSymbolCount() + ".");
        System.out.println("Требование к паролю не менее 5 символов.");
    }

    public int getSymbolCount() {
        return symbolCount;
    }
}