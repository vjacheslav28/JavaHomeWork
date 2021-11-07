package com.pb.pereverzev.hw6;

import java.util.Objects;

    public class Horse extends Animal{
        private boolean introductory = false;

//         * Наследуем  конструктор
        public Horse() {
            super("корм","стойле","иго-го");
        }
// introductory определяем где находится лощадь в стойле или нет.
//introductory
        public Horse(boolean introductory) {
            super("корм","стойле","иго-го");
            this.introductory = introductory;

        }
         // Переопределяем метод
        @Override
        public void makeNoise() {
            super.makeNoise();
            System.out.println("Хочу есть!");
        }
//переопределяем метод
        @Override
        public void eat() {
            System.out.println("Еще добавки");
        }
//где находится
        @Override
        public void getInfo() {
            String intro = "";
            if(introductory) {
                intro = intro + "подкован";
            }
            else {
                intro = intro + "не подкован";
            }
            System.out.println("Молодой " + intro + " конь"
                    + ", в " + getLocation()
                    + ", ест " + getFood()
                    + " и издает звуки " + getNoise() + ".");
        }

        @Override
        public String toString() {
            return "Horse{" +
                    "introductory=" + introductory +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Horse horse = (Horse) o;
            return introductory == horse.introductory;
        }

        @Override
        public int hashCode() {
            return Objects.hash(introductory);
        }
// для определения подкована лошадь или нет
        public boolean introductory() {
            return introductory;
        }
    }

