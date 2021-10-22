package com.pb.pereverzev.hw3;

import java.util.Scanner;

/*
Создайте класс Array в пакете hw3.Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком. (https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.
 */
public class Array {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива 10 элементов");
        Scanner scan = new Scanner(System.in);
        int r=scan.nextInt();
        int[] array = new int[r];//кол-во элементов в массиве
        System.out.println("Введите одномерный массив целых чисел размерностью 10 элементов");
        //int array[] = new int[10];//кол-во элементов в массиве
        for (int k = 0; k < array.length; k++) {
            array[k] = scan.nextInt();
        }
        //вывод введенных элементов массима
        for (int i = 0; i < array.length; i++) {
            //sum = sum + array[i];
            System.out.println("Элементы массива " + array[i]);
            // Расчет суммы
            /*int sum = 0;
            for (int j = 0; j < array.length; j++) {
               if (array[j] > 0)
                sum += array[i];
                sum = sum + array[j];
                System.out.println("sum массива " + sum);*/
        }
        //подсчет суммы элементов массива
        int sum = 0; //
        int sum2 = 0;
        for (int x : array)
            sum += x;
        //Сумма значений элементов массива>0
        for (int y : array)
            if ( y> 0){
            sum2 += y;
            }
        System.out.println("Сумма значений элементов массива " + sum);
        System.out.println("Сумма значений элементов массива>0 " + sum2);
    }
}
//}
