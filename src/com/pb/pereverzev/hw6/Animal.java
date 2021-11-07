package com.pb.pereverzev.hw6;
/*
В пакете hw6 создайте класс Animal и расширяющие его классы Dog, Cat, Horse.
Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
Метод sleep, например, может выводить на консоль "Такое-то животное спит".
Dog, Cat, Horse переопределяют методы makeNoise, eat.
Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
Пусть этот метод печатает на экран food и location пришедшего на прием животного.
Создайте класс VetСlinic в его методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
В цикле отправляйте животных на прием к ветеринару.
Объект класса Veterinarian создайте с помощью рефлексии.
 */
public class Animal {
    private String food;       //еда
    private String location;   // место нахождения
    private String noise;      //  издает звуки

    public Animal(String food, String location, String noise) {
        this.food = food;
        this.location = location;
        this.noise = noise;
    }
        //--****************************************************
        public String getFood () {
            return food;
        }
        public String getLocation() {
            return location;
        }
        public String getNoise () {
            return noise;
        }
        //информирование,что живоное издает звуки
        public void makeNoise() {
            System.out.println("Животное издает звуки: " + noise + ".");
        }
//информирование,что живоное есть
        public void eat() {
            System.out.println("Животное ест " + food + ".");
        }
//информирование,что живоное есть
        public void sleep(){
            System.out.println("Животное спит.");
        }
//Инормацию о животном
        public void getInfo() {
            System.out.println("Всегда ест " + getFood()
                    + ", находится в " + getLocation()
                    + ", издает звуки " + getNoise()
                    + ".");
        }
    }

