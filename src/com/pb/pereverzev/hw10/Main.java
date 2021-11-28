package com.pb.pereverzev.hw10;

public class Main {

    /**
     * Показываем работу метода дженерика NumBox
     */
    private static void getInfo(NumBox box, int index) {
        System.out.println("Значение элемента с индексом " + index + " = "+box.get(index));
        System.out.println("Количество элементов в массиве = "+box.length());
        System.out.println("Cреднее арифметическое значение среди элементов массива = "+box.average());
        System.out.println("Cумма всех элементов массива = "+box.sum());
        System.out.println("Mаксимальный элемент массива = "+box.max());
        System.out.println("---------------------------------------------------------------");
    }

    public static void main(String[] args) {
        // Создадим массив отбъектов типа Integer и проверим работу всех его методов
        NumBox<Integer> myInt = new NumBox<>(4);
        myInt.add(28);
        myInt.add(1);
        myInt.add(23);
        myInt.add(51);
        myInt.add(74);
        myInt.add(101);
        getInfo(myInt,3);

        // Создадим массив объектов типа Float и проверим работу всех его методов
        NumBox<Float> myFloat = new NumBox<>(5);
        myFloat.add(3.8F);
        myFloat.add(30F);
        myFloat.add(0.009F);
        getInfo(myFloat,1);
    }
}