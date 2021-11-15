package com.pb.pereverzev.hw7;
/*
Создать классы наследники Clothes:
- Tie (галстук) реализует интерфейс ManClothes.
 */
public abstract  class Tie extends Clothes implements ManClothes{

    public Tie(Size clotherSize,int clothesPrice,String clothesColour){
        super(clotherSize,clothesPrice,clothesColour);
    }
}
