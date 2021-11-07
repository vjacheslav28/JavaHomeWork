package com.pb.pereverzev.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private String catfluffy = " не пушистый";
//настедование
    public Cat() {
        super("рыбу","доме","мур-мур");
    }

//переопределяем пушистый кот или нет
    public Cat(String catfluffy) {
        super("рыбу","доме","мурррррр");
        this.catfluffy = catfluffy;
    }
//переопределение путем расширения
    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Кот издает мурчание когда ему хорошо!");
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
                + " любит " + getFood() + " и живет в  " + getLocation() + " и успакаивает своим " + getNoise() + ".");
    }

    @Override
    public String toString() {
        return "Кот{" +
                "catfluffy='" + catfluffy + '\'' +
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
//выводим информацию об шерсти кота
    public String getCatFluffy() {
        return catfluffy;
    }
}
