package com.pb.pereverzev.hw7;

/*
Создать классы наследники Clothes:
- Pants (штаны) реализует интерфейсы ManClothes и WomenClothes,
 */
public abstract  class Pants extends Clothes implements ManClothes,WomenClothe {

    public Pants(Size clotherSize,int clothesPrice,String clothesColour){
        super(clotherSize,clothesPrice,clothesColour);
    }
}
