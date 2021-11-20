package com.pb.pereverzev.hw8;
/*
Создать пакет hw8.
Создать класс Auth, который содержит поля login и password и методы:
- signUp (регистрация на сайте) принимающий login, password, и confirmPassword.
Проверяет параметр login, длинна должна быть от 5 до 20 символов. Login должен содержать только латинские буквы и цифры. Если логин не соответствует требованиям нужно выбросить WrongLoginException.
Проверяет параметр password, длинна более 5, только латинские буквы и цифры и знак подчеркивания. Также password и confirmPassword должны совпадать. Если password не соответствует требованиям нужно выбросить WrongPasswordException.
Если проверки все пройдены успешно записать в свои поля значение login и password. Так сохраняем пользователя :)
- signIn (вход на сайт) принимающий login и password.
Проверяет что login и password соответствуют значениям из полей класса.
Если нет - выбрасывает исключение WrongLoginException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение и передает его в конструктор класса Exception.
Создать класс OnlineShop с методом main.
В main создать один объект класса Auth.
Предложить пользователю сперва зарегистрироваться (signUp) потом войти на сайт (signIn).
Обработать исключения методов signUp signIn с помощью блоков try-catch.
 */

public class Auth {private String login;
    private String password;

  //создаем пустой конструктор, заполнение полей после успешной проверки
      public Auth() {

    }

//создаем метод для регистрации на сайт вводим логин и пароль и подтверждения пароля
    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        int loginTrue = 0; // Каждая проверка добавляет 1. Записываем логин в объект, если = 2.
        int passwordTrue = 0; // Каждая проверка добавляет 1. Записываем пароль в объект, если = 3.

        // Проверяем логин на количество символов
        if(login.length()>=5&&login.length()<=20) {
            loginTrue ++;
        }
        else {
            throw new WrongLoginException(login.length(),"ERRORS! Введено недопустимое количество символов в логин");
        }

        // Проверяем символы логина на соответсвие шаблону [A-Z0-9]
        if(login.toUpperCase().matches("[A-Z0-9]+")) {
            loginTrue ++;
        }
        else {
            throw new WrongLoginException("ERRORS! Введены недопустимые символы в логин (допускаются только цифры или латинские литеры).");
        }

        // Проверяем пароль на количество символов
        if(password.length()>5) {
            passwordTrue++;
        }
        else {
            throw new WrongPasswordException(password.length(),"УККЩКЫ! Введено недопустимое количество символов (требуется от 5-20) символов).");
        }

        // Проверяем символы пароля на соответсвие шаблону [A-Z0-9_]
        if(password.toUpperCase().matches("[A-Z0-9_]+")) {
            passwordTrue++;
        }
        else {
            throw new WrongPasswordException("ERRORS! Допускаются только цифры, английские литеры и знак подчерка).");
        }

        // Проверяем пароль и его подтверждение на подобие
        if(password.equals(confirmPassword)) {
            passwordTrue++;
        }
        else {
            throw new WrongPasswordException("ERRORS! Пароль для потверждения не совпадает");
        }

        // Проверяем требование к логину
        if(loginTrue==2&&passwordTrue==3) {
            System.out.println("Введенный логин и пароль соответсвует требованиям.");
            System.out.println("Спасибо!Логин и пароль успешно сохранены!");
            this.login = login;
            this.password = password;
        }
        else {
            System.out.println("Введите корректный логин и пароль!");
        }
    }


    // Метод для проверки логина/пароля при входе на сайт.

    public void signIn(String login, String password) throws WrongLoginException{

        if(login.equals(this.login)&&password.equals(this.password)) {
            System.out.println("Поздравляем! Вы авторизовались под своим акаунтом.");
        }
        else {
            throw new WrongLoginException("ERRORS! Логин и пароль не совпадают.");
        }
    }

    //создаем гетеры для определения состотяния обьекта.

    public String getLogin() {
        return "Логин: " + login;
    }

    public String getPassword() {
        return "Пароль: " + password;
    }
}