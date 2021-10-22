package com.pb.pereverzev.hw3;
import jdk.nashorn.internal.ir.IdentNode;

import java.util.Random;
import java.util.Scanner;

/*
Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том,
 что число отгадано.
Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.
*/
public class Bingo {
    public static void main(String[] args) {
            //метод ввода пользователем с клавиатуры
            Scanner scan = new Scanner(System.in);
            //Рандомный выбер чисел
            Random random = new Random();
            //Обьявляем переменные
            int operand1;
            // Счет попыток
            int attempt = 0;
            //случаные числа
        int x = random.nextInt(101);//макс. вводимое число 100
        System.out.println("Случайное число: " + x);
            System.out.println("Угадайте задуманное целое число.");
            System.out.print("Введите целое число от 0 - 100: ");
            System.out.println("\nДля выхода из игры введите -1");
            operand1 = scan.nextInt(); // вводимое число
            while (attempt <= x) {
                attempt++;
                //System.out.println("Попытка " + attempt + ":");
               //Присвоиваем значение
                Integer value;
                value = scan.nextInt();
                if (value == -1) {
                    System.out.println("Вы вышли из игры");
                    break;
                }

                if (value != x) {
                    try {
                        if (x>value){
                        System.out.println("Ваше число "+ value +" меньше загаданного " );
                        }
                        if (x < value)
                            System.out.println("Ваше число " + value + " больше загаданного ");
                      } catch (Exception ex) {
                        //System.out.println("Errors - не допустимый формат"+ex);
                    }
                    continue;
                }

                System.out.println("Поздравляем, Вы угадали число " + value + " с " + attempt + " попытки!");
                break;
            }
            System.out.println("Конец игры!");
        }

    }