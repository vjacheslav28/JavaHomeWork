package com.pb.pereverzev.hw2;

import java.util.Scanner;
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
    public static <Char> void main(String[] args) {
        //Обьявляем переменные
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign="+-*/";
//Блок отображения для пользоваетля
        System.out.print("Введите целое число operand1: ");
        operand1 = scan.nextInt();
        System.out.print("Введите целое число operand2: ");
        operand2 = scan.nextInt();
        System.out.print("Введите арифметический знак: ");
        sign = scan.next();
//
         char sign1 = sign.charAt(0);
//switch(оператор сравенения) определяет какой знак применен
        switch (sign1) {
            case '+':
                System.out.println("Результат выполнения арифметической операции = " + (operand1 + operand2));
                break;
            case '-':
                System.out.println("Результат выполнения арифметической операции = " +(operand1-operand2));
                break;
            case '*':
                System.out.println("Результат выполнения арифметической операции = " + (operand1 * operand2));
                break;
            case '/':
         //проверка для уведомления пользователюделения на 0
                try {
                System.out.println("Результат выполнения арифметической операции = " + (operand1 / operand2));
                } catch (Exception ex) {
                    System.out.println("Деление на 0 не возможно!!!" + ex);
                }
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
    }
  }
}