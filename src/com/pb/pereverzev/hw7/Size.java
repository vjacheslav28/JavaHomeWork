package com.pb.pereverzev.hw7;
/*
*Создать пакет hw7 и в нем создать перечисление (enum) Size со значениями XXS, XS, S, M, L.
* Перечисление содержит метод getDescription(), возвращающий строку для XXS "Детский размер",
* для остальных "Взрослый размер". Так же перечисление должно иметь метод getEuroSize()
* возвращающий числовое значение (32, 34, 36, 38, 40) соответствующее каждому размеру.
* Создать конструктор принимающий на вход description и euroSize.
 */
public enum Size {
    XXS("Детский размер",32),
    XS("Взрослый размер",34),
    S("Взрослый размер",36),
    M("Взрослый размер",38),
    L("Взрослый размер",40);

    private String Description;
    private int EuroSize;
    Size(String Description,int EuroSize) {
        this.Description = Description;
        this.EuroSize=EuroSize;
    }
    //метод возрващающий размер
public void getDescription(){
 System.out.println("Описание - " + Description);
}
    //метод возрващающий европейский размер
public void EuroSize(){
    System.out.println("Европейский размер - " + EuroSize);
}
}
