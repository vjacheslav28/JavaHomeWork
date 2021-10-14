import java.util.Scanner;
package com.pb.pereverzev.hw2;
/*
Создайте две целочисленных переменные с именами operand1 и operand2.
Предложите ввести значения operand1 и operand2 пользователю.
Также предложите пользователю ввести знак арифметической операции и поместите его в строковую переменную sign.
Пусть калькулятор может только складывать, отнимать, умножать и делить.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль.
И если таковая имеется, то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String symbol;

        operand1=scan.nextIn();
        System.out.print("Введите operand1: ");

        operand2=scan.nextIn();
        System.out.print("Введите operand2: ");

        symbol=scan.next();
        System.out.print("Введите знак: ");

        //этот опреатор будет определять какой знак применить
      /*  switch (operand1) {
            case 1:
                System.out.println("Отлично!");
                break;*/

    }
}