package org.example;

public class Сотрудник {
    String ФИО;
    String должность;
    String email;
    int телефон;
    int зарплата;
    int возраст;

    public Сотрудник(String fullName, String jobTitle, String emailAdress, int telephoneNumber, int salary, int age) {


        ФИО = fullName;
        должность = jobTitle;
        email = emailAdress;
        телефон = telephoneNumber;
        зарплата = salary;
        возраст = age;

    }

    public void someInfo() {

         System.out.println("ФИО: " + ФИО + "\n" + "должность: " + должность + "\n" + "email: " + email + "\n" + "телефон: " + телефон + "\n" + "зарплата: " + зарплата + "\n" + "возраст: " + возраст);
    }
}


