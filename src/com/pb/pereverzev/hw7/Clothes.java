package com.pb.pereverzev.hw7;
/*
Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
 */
public abstract class Clothes {
    private Size clothesSize;
    private int clothesPrice;
    private String clothesColour;

    public Clothes(Size clothesSize,int clothesPrice,String clothesColour){
        this.clothesSize=clothesSize;
        this.clothesPrice=clothesPrice;
        this.clothesColour=clothesColour;
    }
//
    public Size getClothesSize(){
        return clothesSize;
}
    public int getClothesPrice(){
        return clothesPrice;
}
public String getClothesColour(){
        return clothesColour;
}
}
