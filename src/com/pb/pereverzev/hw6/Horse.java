package com.pb.pereverzev.hw6;

import java.util.Objects;

    public class Horse extends Animal{
        private boolean isIntroductory = false;

//         * Наследуем  конструктор
        public Horse() {

            super("корм","стойле","иго-го");
        }
// introductory определяем где находится лощадь в стойле или нет.
//introductory
        public Horse(boolean isIntroductory) {
            super("корм","стойле","иго-го");
            this.isIntroductory = isIntroductory;

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
            if(isIntroductory) {
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
            return "Конь{" +
                    "isIntroductory=" + isIntroductory +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Horse horse = (Horse) o;
            return isIntroductory == horse.isIntroductory;
        }

        @Override
        public int hashCode() {

            return Objects.hash(isIntroductory);
        }
// для определения подкована лошадь или нет
        public boolean getIsIntroductory() {
            return isIntroductory;
        }
    }

