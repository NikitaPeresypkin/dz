package org.example;

public class Сотрудник {
    String ФИО, должность, email;
    int телефон, зарплата, возраст;

    public Сотрудник(String ФИО, String должность, String email, int телефон, int зарплата, int возраст) {
        this.ФИО = ФИО;
        this.должность = должность;
        this.email = email;
        this.телефон = телефон;
        this.зарплата = зарплата;
        this.возраст = возраст;
    }

    public void someInfo() {
        System.out.println("ФИО: " + ФИО + "\n" + "должность: " + должность + "\n" + "email: " + email + "\n" + "телефон: " + телефон + "\n" + "зарплата: " + зарплата + "\n" + "возраст: " + возраст + "\n");
    }
}


