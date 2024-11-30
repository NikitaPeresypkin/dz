package org.example;

public class Сотрудник {
    static String ФИО;
    String должность;
    String email;
    int телефон;
    int зарплата;
    int возраст;

    public Сотрудник() {
        ФИО = "Александр Петрович Марафонец";
        должность = "Оператор ЭВМ";
        email = "marafon999@gmail.com";
        телефон = 263696;
        зарплата = 90000;
        возраст = 60;

    }

    public void someInfo() {
        System.out.println("ФИО: "+ФИО+"\n"+"должность: "+должность+"\n"+"email: "+email+"\n"+"телефон: "+телефон+"\n"+"зарплата: "+зарплата+"\n"+"возраст: "+возраст );
    }
}


