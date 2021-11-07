package com.pb.pereverzev.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String catfluffy = "не определен";
//настедование
    public Cat() {
        super("рыбу","дом","мяу-мяу");
    }

//переопределяем пушистый кот или нет
    public Cat(String catfluffy) {
        super("рыбу","дом","мяу");
        this.catfluffy = catfluffy;
    }
//переопределение путем расширения
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кот издает мурчание кгда ему хорошо!");
    }
//расширяем метод
    @Override
    public void eat() {
        super.eat();
        System.out.println("От этой еды " + catfluffy + " кот имеет прекрасный вид.");
    }
//
    @Override
    public void getInfo() {
        System.out.println("Этот " + catfluffy + " кот "
                + " любит " + getFood() + " как еду"
                + ", решил, что его " + getLocation() + " это наш дом"
                + " и радует нас своим хриплым " + getNoise() + ".");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catColour='" + catfluffy + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(catfluffy, cat.catfluffy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catfluffy);
    }

    /**
     * Добаим сеттер только для вывода описания окраса кота.
     * Остальные сеттеры достались по наследству от Animal.
     */
    public String getCatColour() {
        return catfluffy;
    }
}
