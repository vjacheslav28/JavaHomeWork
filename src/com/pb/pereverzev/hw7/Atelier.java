package com.pb.pereverzev.hw7;
/*
Создать класс Atelier с методом main, и еще двумя статическими методами:
dressMan(Clothes[] clothes)
dressWomen(Clothes[] clothes)
на вход которых будет поступать массив, содержащий все типы одежды.
В методе main создать массив, содержащий все типы одежды, и вызвать методы dressMan и dressWomen передав туда этот массив.
Метод dressWomen выводит на консоль всю информацию о женской одежде.
Метод dressMan выводит на консоль всю информацию о мужской одежде.
В методах dressWomen и dressMan использовать оператор instanceof для определения мужская это одежда или женская.
 */

public class Atelier {
    //выводим общую инфорацию об одежде
    private static void getClothesInfo(Size clothesSize, String clothesColour, int clothesPrice) {
        System.out.println("Размер - " + clothesSize + ".");
        System.out.println("Цвет - " + clothesColour + ".");
        System.out.println("Цена - " + clothesPrice + ".");
        System.out.println("--------------------------------------------");
    }
    //вывоодим массив мужской одежды
    private static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда: ");
        for(Clothes clo:clothes){
            if(clo instanceof ManClothes){
                ((ManClothes) clo).dressMan();
                getClothesInfo(clo.getClothesSize(),clo.getClothesColour(),clo.getClothesPrice());
            }
        }
    }
    //выводим массив женской одежды
    private static void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда: ");
        for(Clothes clo:clothes){
            if(clo instanceof WomenClothe){
                ((WomenClothe) clo).dressWomen();
                getClothesInfo(clo.getClothesSize(),clo.getClothesColour(),clo.getClothesPrice());
            }
        }
    }
    public static void main(String[] args) {

        // Создаем объекты одежды:
        Clothes pawPatrolTshirt = new Tshirt(Size.XS,500,"Синий") {
            @Override
            public void dressMan() {
                System.out.println("Футболка фирмы \"Adidas\".");
                Size.XS.getEuroSize();
                Size.XS.getDescription();
            }

            @Override
            public void dressWomen() {
                System.out.println("Футболка фирмы \"Adidas\".");
                Size.XS.getEuroSize();
                Size.XS.getDescription();
            }
        };

        Clothes threeCatsTshirt = new Tshirt(Size.XXS,600,"Белый") {

            @Override
            public void dressMan() {
                System.out.println("Футболка фирмы \"Nike\".");
                Size.XXS.getEuroSize();
                Size.XXS.getDescription();
            }

            @Override
            public void dressWomen() {
                System.out.println("Футболка фирмы \"Adidas\".");
                Size.XXS.getEuroSize();
                Size.XXS.getDescription();
            }
        };

        Clothes classicPants = new Pants(Size.M,800,"Желтый") {
            @Override
            public void dressMan() {
                System.out.println("Мужские спортивные штаны");
                Size.M.getEuroSize();
                Size.M.getDescription();
            }

            @Override
            public void dressWomen() {
                System.out.println("Женские спортивные штаны.");
                Size.M.getEuroSize();
                Size.M.getDescription();
            }
        };

        Clothes jeansPants = new Pants(Size.M,300,"Черные") {
            @Override
            public void dressMan() {
                System.out.println("Брюки классические");
                Size.M.getEuroSize();
                Size.M.getDescription();
            }

            @Override
            public void dressWomen() {
                System.out.println("Брюки классические");
                Size.M.getEuroSize();
                Size.M.getDescription();
            }
        };

        Clothes shortSkirt = new Skirt(Size.S,1000,"Красная") {
            @Override
            public void dressWomen() {
                System.out.println("Юбка короткая.");
                Size.S.getEuroSize();
                Size.S.getDescription();
            }
        };

        Clothes longSkirt = new Skirt(Size.L,1200,"Черная") {
            @Override
            public void dressWomen() {
                System.out.println("Юбка длинная.");
                Size.L.getEuroSize();
                Size.L.getDescription();
            }
        };

        Clothes rainbowTie = new Tie(Size.S,500,"Черный") {
            @Override
            public void dressMan() {
                System.out.println("Галстук классический.");
                Size.S.getEuroSize();
                Size.S.getDescription();
            }
        };

        Clothes businessTie = new Tie(Size.S,188,"Бордовый") {
            @Override
            public void dressMan() {
                System.out.println("Галстук веселый.");
                Size.S.getEuroSize();
                Size.S.getDescription();
            }
        };


        Clothes[] myClothes = {pawPatrolTshirt,threeCatsTshirt,classicPants,jeansPants,
                shortSkirt,longSkirt,rainbowTie,businessTie};
        dressMan(myClothes);
        dressWomen(myClothes);
    }
}
