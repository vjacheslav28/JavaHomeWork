package com.pb.pereverzev.hw8;

import java.util.Scanner;

public class OnlineShop {
// что ввел клиент
   private static String getInputStream(String clientMsg) {
        System.out.println(clientMsg);
        Scanner scan = new Scanner(System.in);
        String inputValue = scan.nextLine();

        return inputValue;
    }

    public static void main(String[] args) throws WrongLoginException {

        try {
            // Регистрация на сайте
            System.out.println("Для получения дополнительных возможностей, необходимо пройти регистрацию на сайте.");
            Auth newAuth = new Auth();
            newAuth.signUp(getInputStream("Введите логин"),
                    getInputStream("Введите пароль"),
                    getInputStream("Подтвердите пароль"));
            System.out.println(newAuth.getLogin());
            System.out.println(newAuth.getPassword());

            // Вход на сайт
            System.out.println("--------------------------------------------------------");
            System.out.println("Для входа  на сайт введите свой логин и пароль.");
            newAuth.signIn(getInputStream("Введите логин"),
                    getInputStream("Введите пароль"));

        } catch (WrongLoginException | WrongPasswordException e) {

        }
    }
}