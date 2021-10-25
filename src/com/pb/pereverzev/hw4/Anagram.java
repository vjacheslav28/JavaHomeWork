package com.pb.pereverzev.hw4;
import java.util.Scanner;
import java.util.Arrays;

/*
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).
 */
public class Anagram {
    static boolean isAnagram(String word, String wordAnagramm) {
        word = word.toLowerCase().replaceAll("[\\W]", "");
        wordAnagramm = wordAnagramm.toLowerCase().replaceAll("[\\W]", "");;
        if (word.length() != wordAnagramm.length()) {
            System.out.println("Errors length text!!!");
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = wordAnagramm.indexOf(c);
            if (index != -1) {
                wordAnagramm = wordAnagramm.substring(0, index) + wordAnagramm.substring(index + 1);
            } else {
                return false;
            }
        }
        return wordAnagramm.isEmpty();
    }
//Блок ввода параметров
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите оригинальный текст: ");
        String word = scan.nextLine();
        System.out.println("Введите текст \"Анаграмм\": ");
        String wordAnagramm = scan.nextLine();
        scan.close();
        boolean rez = isAnagram(word, wordAnagramm);
        System.out.println((rez) ? "Anagrams" : "Not Anagrams");
    }
}