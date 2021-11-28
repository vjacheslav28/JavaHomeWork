package com.pb.pereverzev.hw10;

import java.util.Arrays;
/*
Создать пакет hw10.
Реализовать параметризованный класс NumBox, T - параметр типа.
Параметром должен быть любой класс-наследник Number (задать необходимое условие при объявлении класса NumBox).
Класс содержит:
- массив из объектов класса T, инициализировать массив в конструкторе.
- конструктор принимающий параметр - максимальную длину массива.
- метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
- метод T get(int index) возвращающий число по индексу.
- метод int length() возвращает текущее количество элементов.
- метод double average() - подсчет среднего арифметического среди элементов массива.
- метод double sum() - сумма всех элементов массива.
- метод T max() - максимальный элемент массива.
При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
 */
public class NumBox<T extends Number> {
    private final T[] numbers;

    public NumBox(int size) {
        numbers = (T[]) new Number[size];
    }

    /**
     Добавляем обьект в массив
     */
    void add(T num) {
        int index = 0;

        // Вычисляем от начала незаполненный индекс
        for(Number nums : numbers) {
            if(nums == null) {
                index = index;
            }
            else {
                index++;
            }
        }

        // проверка наполняемости массива,если не полон, то добавляем новый объект.
        try {
            get(index);
            this.numbers[index] = num;
            System.out.println("Элемент с индексом "+index+" - добавлен в массив.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERRORS!!! - Массив заполнен! Добавление еще одного єлемента с индекстом - "+e.getMessage()+" невозможно.");
        }
    }

    /**
     возвращаем метод число по индексу
     */
    T get(int index) {
        return numbers[index];
    }

    /**
     * возвращаем метод текущее количество элементов в массиве
     */
    int length() {
        int iNotEmpty = 0;
        for(Number nums : numbers) {
            if(nums != null) {
                iNotEmpty++;
            }
        }
        return iNotEmpty;
    }

    /**
      возвращаем метод среднее арифметическое среди элементов массива
     */
    double average() {
        double dSum = 0D;
        int iCount = 0;
        for(Number nums : numbers) {
            if(nums != null) {
                dSum += nums.doubleValue();
                iCount++;
            }
        }
        return dSum/iCount;
    }

    /**
      возвращаем метод сумму всех элементов массива
     */
    double sum() {
        double dSum = 0D;
        for(Number nums : numbers) {
            if(nums != null) {
                dSum += nums.doubleValue();
            }
        }
        return dSum;
    }

    /**
      возвращаем метод максимальный элемент массива
     */
    T max() {
        T tMax = null;
        double dMax = 0D;
        for(Number nums : numbers) {
            if(nums != null) {
                if(dMax < nums.doubleValue()) {
                    dMax = nums.doubleValue();
                    tMax = (T) nums;
                }
            }
        }
        return tMax;
    }

}
