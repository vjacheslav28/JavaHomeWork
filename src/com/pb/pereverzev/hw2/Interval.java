package com.pb.pereverzev.hw2;
import java.util.Scanner;
/*
Напишите программу определения интервала.
Создайте класс Interval в пакете hw2.
Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
Программа должна выяснить в какой промежуток попадает введенное число [0-14] [15-35] [36-50] [51-100].
Вывести на экран сообщение с подходящим промежутком.
Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.
 */
public class Interval {
    public static <Char> void main(String[] args) {
        //Обьявляем переменные
        Scanner scan = new Scanner(System.in);
        int interval;
//Блок отображения для пользоваетля
        System.out.print("Введите целое число: ");
        interval = scan.nextInt();
        if (interval >= 0 && interval <= 14) {
            System.out.print("Ваше число " + interval + " попадает в интервал [0-14] ");
        }
        else if (interval >= 15 && interval <= 35) {
            System.out.print("Ваше число " + interval + " попадает в интервал [15-35] ");
        }
        else if (interval >= 36 && interval <= 50) {
            System.out.print("Ваше число " + interval + " попадает в интервал [36-50] ");
        }
        else if (interval >= 51 && interval <= 100) {
            System.out.print("Ваше число " + interval + " попадает в интервал [51-100] ");
        }
        else if (interval <0 || interval > 101) {
                System.out.print("Ваше число " + interval + " не попадает ни в один из интервалов [0-14] [15-35] [36-50] [51-100]");
          }
        }
      }

