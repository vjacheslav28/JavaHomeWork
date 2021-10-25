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

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class CapitalLetter {
    //
    public static void main(String[] args)
    {
       //Вызов сканера
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст \"Истина — это то, что выдерживает проверку опытом\". Эйнштейн А.: ");
        String inText = in.nextLine();
        System.out.println("Результат - " + toUP(inText));
    }
    public static String toUP(@NotNull String inText)
    {
        //-------------------
        char[] result = inText.toCharArray();
        if(Character.isAlphabetic(result[0]))result[0]=Character.toUpperCase(result[0]);
        String res=""+result[0];
        for(int i=1;i<result.length;i++)
        {
            if(Character.isAlphabetic(result[i]) && !Character.isAlphabetic(result[i-1]))result[i]=Character.toUpperCase(result[i]);
            res+=result[i];
        }
        return res;
    }
}
