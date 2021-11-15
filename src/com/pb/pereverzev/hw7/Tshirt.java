package com.pb.pereverzev.hw7;
/*
* Создать классы наследники Clothes:
- Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes,
* */

public abstract class Tshirt extends Clothes implements ManClothes,WomenClothe{

    public Tshirt(Size clothesSize,int clothesPrice, String clothesColour){
        super(clothesSize,clothesPrice,clothesColour);
    }
}
