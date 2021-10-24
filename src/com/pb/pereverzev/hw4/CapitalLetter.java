package com.pb.pereverzev.hw4;
/*
1. Создайте класс CapitalLetter в пакете hw4.
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
*/

import java.util.Scanner;

public class CapitalLetter {
    static void procedure(){
        Scanner in = new Scanner(System.in);
        String inText;
        System.out.print("Введите текст: ");
        inText = in.next();
        String str=inText;
        String strUpper = str.toUpperCase();
        //inText = WordUtils.capitalize(inText);
        System.out.print("Результат - " + inText);
        System.out.print("Результат2 - " + strUpper);
    }
    public static void main(String[] args){
        procedure();
    }
}
