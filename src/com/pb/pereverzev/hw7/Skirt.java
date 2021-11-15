package com.pb.pereverzev.hw7;
/*
Skirt (юбка) реализует интерфейс WomenClothes,

 */
public abstract  class Skirt extends Clothes implements WomenClothe{
    public Skirt(Size clotherSize,int clothesPrice,String clothesColour){
        super(clotherSize,clothesPrice,clothesColour);
    }
}
