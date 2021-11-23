package com.pb.pereverzev.hw9;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.ArrayList;
public class FileNumbers {
    /*
    В пакете hw9 создать класс FileNumbers.
В нем создать методы:
- createNumbersFile - создает текстовый файл "numbers.txt" заполненный случайными целыми числами от 1 до 99. 10 строк и по 10 чисел
в каждой строке. Числа разделять пробелами.
- createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt" в который входят
все числа из "numbers.txt" только все четные заменены на 0.
В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile.
     */
    /*
     создаем метод создает массив случайных чисел и записывает их в файл "numbers.txt"
     catPath - путь к каталогу, где будут лежать файлы с данными
     srcFileName - имя файла с источником данных
     elemCount - количество элементов, которое нужно записать в файл
     countInRow - количество элементов в одной строке
     */
    private static void createNumbersFile(String catPath, String srcFileName, int elemCount, int countInRow) {
        // создадим массив размерностью elemCount случайных элементов от 1 до 99
        int myArr[] = new int[elemCount];
        for(int i=0;i<elemCount;i++) {
            int minValue = 0;
            int maxValue = 99;
            myArr[i] = (int)(Math.random()*(maxValue-minValue+1)+minValue);
        }

        // запишем данные массива в файл "numbers.txt"
        try (BufferedWriter myWriter = Files.newBufferedWriter(Paths.get(catPath + srcFileName))) {
            String delimiter = " "; // разделитель - пробел

            for(int j=0;j<elemCount;j+=countInRow) {
                for(int i=j;i<j+countInRow;i++) {
                    if (i<elemCount) {
                        myWriter.write(myArr[i]+delimiter);
                    }
                }
                myWriter.newLine();
            }
            myWriter.flush();
            System.out.println("createNumbersFile: Данные успешно созданы и записаны в файл!");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error with file write: " + e);
        }
    }

    /*
      Создаем метод для считывания массива чисел из файла "numbers.txt"
      catPath - путь к каталогу, где будут лежать файлы с данными
      srcFileName - имя файла с источником данных
      destFileName - имя файла с измененными данными
      elemCount - количество элементов, которое нужно записать в файл
      countInRow - количество элементов в одной строке
     */
    private static void createOddNumbersFile(String catPath, String srcFileName, String destFileName, int elemCount, int countInRow) {
        // Считаем данные из файла и запишем их в массив
        List<Integer> myList = new ArrayList<Integer>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(catPath + srcFileName))) {
            String line;
            while((line = reader.readLine()) != null) {
                String[] array = line.split(" ");
                for(int i=0;i< array.length;i++) {
                    myList.add(Integer.parseInt(array[i]));
                }
            }
        }
        catch (Exception e) {
            System.out.println("Error with file read: " + e);
        }
        int[] myArr = myList.stream().mapToInt(Integer::intValue).toArray();

        // Заменим все четные числа на 0
        for(int i=0;i<myArr.length;i++) {
            if(myArr[i]%2==0) {
                myArr[i] = 0;
            }
            else {
                myArr[i] = myArr[i];
            }
        }

        // записываем данные измененного массива в файл "odd-numbers.txt"
        try (BufferedWriter myWriter = Files.newBufferedWriter(Paths.get(catPath + destFileName))) {
            String delimiter = " "; // разделитель - пробел

            for(int j=0;j<elemCount;j+=countInRow) {
                for(int i=j;i<j+countInRow;i++) {
                    if (i<elemCount) {
                        myWriter.write(myArr[i]+delimiter);
                    }
                }
                myWriter.newLine();
            }
            myWriter.flush();
            System.out.println("createOddNumbersFile: Данные считаны, изменены и записаны в файл!");
        }
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error with file write: " + e);
        }
    }
    public static void main(String[] args) {
        String catPath = "C:/Users/User/Documents/Java/JavaHomeWork/src/com/pb/pereverzev/hw9/" ; // каталог
        String srcFileName = "numbers.txt"; // имя файла с первичными данными
        String destFileName = "odd-numbers.txt"; // имя файла с измененными данными
        int elemCount = 100; // количество элементов для записи
        int countInRow = 10; // количество элементов в строке

        // Создаем данные и записываем в файл
        createNumbersFile(catPath,srcFileName,elemCount,countInRow);

        // Считаем данные из файла,и изменяем четные числа потом запишем в другой файл
        createOddNumbersFile(catPath,srcFileName,destFileName,elemCount,countInRow);
    }
}
