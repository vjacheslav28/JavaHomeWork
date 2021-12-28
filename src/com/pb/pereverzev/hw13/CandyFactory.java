package com.pb.pereverzev.hw13;

import java.util.ArrayList;

/**
 * В маленькой конфетной фабрике  есть только один ящик (tray) на traySize конфет, куда мастер выкладывает конфеты по номеру номенклатуры от 1 до 10.
 * Мастер делает конфеты в количестве не более, чем количество свободных мест в ящике. Каждая операция добавляет минимум 1 конфету в ящик.
 * Покупатели покупают конфеты в количестве не более, чем количество конфет в ящике. Каждая операция забирает из лотка минимум 1 конфету.
 */
public class CandyFactory {

    /**
     * Метод генерирует случайное число в интервале (1,maxNumber)
     * @param maxNumber - верхний предел случайного числа
     * @return num - возвращаемое значение
     */
    private static int getNum(int maxNumber) {
        int minValue = 1;
        int maxValue = maxNumber;
        int num = (int) (Math.random()*(maxValue-minValue+1)+minValue);
        return num;
    }

    /**
     * Метод вычисляет количество пустых элементов в ящике
     * @param arrList - коллекция - ящик с конфетами
     * @param size - максимальное количество мест в ящике
     * @return iNullElements - количество пустых элементов в ящике
     */
    private static int getNullElements(ArrayList arrList, int size) {
        int iNullElements = 0; // Количество пустых элементов в лотке
        int iNotNullElements = 0; // Колтичество непустых элементов в лотке
        if(!arrList.isEmpty()) {
            for(Object candy : arrList) {
                iNotNullElements++;
            }
            iNullElements = size-iNotNullElements;
        }
        else {
            iNullElements = size;
        }
        return iNullElements;
    }

    /**
     * Метод возвращает текущее количество элементов - конфет в ящике
     * @param arrList - коллекция - ящик с конфетами
     * @param size - максимальное количество мест в ящике
     * @return
     */
    private static int getCandyCount(ArrayList arrList, int size) {
        return (size - getNullElements(arrList, size));
    }

    /**
     * Метод информирует о текущем количестве конфет в ящике
     * @param arrList - коллекция - ящик с конфетами
     * @param size - максимальное количество мест в ящике
     */
    private static void infoCandyCount(ArrayList arrList, int size) {
        System.out.println("------------------------------------------------------");
        System.out.println("Текущее количество мест в ящике - " + getCandyCount(arrList, size));
        System.out.println("------------------------------------------------------");
    }

    /**
     * Метод заполняем ящик рандомным количеством конфет, но не более пустого доступного количества
     * @param arrList - коллекция - ящик с конфетами
     * @param size - максимальное количество мест в ящике
     */
    private static synchronized void setCandy(ArrayList arrList, int size) {
        int notNullSize = getNullElements(arrList,size); // максимальное количество конфет, которое можно положить в ящик при текущем состоянии
        if(notNullSize>0) {
            int candyCnt = getNum(notNullSize);
            for(int i = 0;i<candyCnt;i++) {
                int bunNum = getNum(10);
                arrList.add(bunNum);
                System.out.println("Положил конфету в ящик № "+bunNum);
            }
            infoCandyCount(arrList, size);
        }
        else {
            System.out.println("Ящик заполнен. Жду, пока покупатели купят немного конфет.");
        }
    }

    /**
     * Метод забирает конфеты из ящика в произвольном количестве, но не более доступного количества.
     * @param arrList - коллекция - ящик с конфетами
     * @param size - максимальное количество мест в ящике
     */
    private static synchronized void getCandy(ArrayList arrList, int size) {
        int notNullSize = size - getNullElements(arrList,size); // максимальное количество конфет, которое можно забрать из ящика при текущем состоянии
        if(notNullSize>0) {
            int candyCnt = getNum(notNullSize); // рандомное число конфет, которое хотим забрать из ящика, но не больше notNullSize

            // Создаем массив конфет, которые хотим забрать из ящика
            int[] miniTray = new int[candyCnt];
            for(int i = 0;i<miniTray.length;i++) {
                miniTray[i] = (Integer) arrList.get(i);
            }

            // Забираем конфеты из ящика
            for(int i : miniTray) {
                System.out.println("Забрал из ящика конфету № " + i);
                arrList.remove(new Integer(i));
            }
            infoCandyCount(arrList, size);
        }
        else {
            System.out.println("Ящик пустой. Жду, пока мастер выложит конфеты в ящик.");
        }
    }

    public static void main(String[] args) throws IllegalThreadStateException{
        int traySize = 5; // Максимальное количество мест в ящике
        ArrayList<Integer> tray = new ArrayList<Integer>(traySize); // ящик - коллекция с конфетами
        int stepCount = 0;

        class ProducerThread extends Thread {

            private boolean isActive;

            ProducerThread() {
                isActive = true;
            }

            void disable() {
                isActive = false;
            }

            @Override
            public void run() {
                while(isActive) {
                    try {
                        setCandy(tray, traySize);
                        ProducerThread.sleep(2000);
                    }
                    catch (IllegalThreadStateException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

        class ConsumerThread extends Thread {

            private boolean isActive;

            ConsumerThread() {
                isActive = true;
            }

            void disable(){
                isActive = false;
            }

            @Override
            public void run() {
                while (isActive) {
                    try {
                        getCandy(tray,traySize);
                        ConsumerThread.sleep(2000);
                    }
                    catch (IllegalThreadStateException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        ProducerThread producer = new ProducerThread();
        ConsumerThread consumer = new ConsumerThread();

        try {
            producer.start();
            consumer.start();
            stepCount++;

            if(getCandyCount(tray, traySize)==0) {
                System.out.println("Ящик пустой. Жду, пока мастер выложит конфеты в ящик.");
                producer.join();
            }

            if(getCandyCount(tray, traySize)==traySize) {
                System.out.println("Ящик заполнен. Жду, пока покупатели купят немного конфет.");
                consumer.join();
            }

            if(stepCount>10) {
                producer.disable();
                consumer.disable();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
