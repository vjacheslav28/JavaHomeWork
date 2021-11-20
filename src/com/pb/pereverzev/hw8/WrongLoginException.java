package com.pb.pereverzev.hw8;

// для не корректоного отображения логина
public class WrongLoginException extends Exception{
    private int symbolCount;

    public WrongLoginException() {

    }
//для искоючения о неправильном вводе логина и пароля
    public WrongLoginException(String clientMsg) {
        System.out.println(clientMsg);
    }
//для неправильного оттобрежения введения количества символов
    public WrongLoginException(int symbolCount, String clientMsg) {
        this.symbolCount = symbolCount;
        System.out.println(clientMsg + " - " + getSymbolCount() + ".");
        System.out.println("Длина логина находится в интервале 5-20 символов.");
    }

    public int getSymbolCount() {
        return symbolCount;
    }
}