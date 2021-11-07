package com.pb.pereverzev.hw6;

import java.util.Objects;

public class Dog extends Animal{

        private boolean isDogBreed = false;
        private String dogBreed = "Немецкая овчарка";

        public Dog() {

                super("мясо","дворе","гав-гав");
        }

   //породистая или нет
            public Dog(boolean isDogBreed, String dogBreed) {
                super(" мясо "," дворе ","гав");
                this.isDogBreed = isDogBreed;
                this.dogBreed = dogBreed;
        }
//переопределение
        @Override
        public void makeNoise() {
                super.makeNoise();
                System.out.println("Собака оскаливает зубы, когда лает.");
        }
//
        @Override
        public void eat() {
                System.out.println("Порода этой собаки - " + dogBreed);
        }
//собока породистая или нет
        @Override
        public void getInfo() {
                String breedDog = "";
                if(isDogBreed) {
                        breedDog = breedDog + " обученная команд ";
                }
                else {
                        breedDog = breedDog + " не обученная команд ";
                }
                System.out.println("Эта собака " + breedDog + " кушает " + getFood()
                        + ", живет во " + getLocation()
                        + ", издает " + getNoise() + "-" + getNoise()
                        + " и порода ее " + getDogBreed());
        }

        @Override
        public String toString() {
                return "Собака{" +
                        "isDogBreed=" + isDogBreed +
                        ", dogBreed='" + dogBreed + '\'' +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass())
                        return false;
                Dog dog = (Dog) o;
                return isDogBreed == dog.isDogBreed && Objects.equals(dogBreed, dog.dogBreed);
        }

        @Override
        public int hashCode() {
                return Objects.hash(isDogBreed, dogBreed);
        }
//сеттер для определения породы собаки
        public boolean getIsDogBreed() {
                return isDogBreed;
        }

        public String getDogBreed() {
                return dogBreed;
        }
}