package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //task(1);
    Сотрудник id1 = new Сотрудник("Александр Петрович Марафонец", "Оператор ЭВМ", "marafon999@gmail.com", 263696, 90000, 60);
        id1.someInfo();

    task(2);

        Сотрудник Person1;
        Сотрудник[] personArry = new Сотрудник[5];
        personArry[0] = new Сотрудник("Ким Иван Иванович", "Сторож", "kivan@gmail.com", 261254, 70000, 53);
        personArry[1] = new Сотрудник("Староверов Рамзан Ахмедович", "Администратор", "sramzan@mail.ru", 26254, 70000, 22);
        personArry[2] = new Сотрудник("Перервин Павел Юриьевич", "Технолог", "ppavel.com", 261210, 40000, 43);
        personArry[3] = new Сотрудник("Шмидт Олег Андреевич", "Директор", "Scholeg@gmail.com", 610242, 60000, 51);
        personArry[4] = new Сотрудник("Попова Надежда Михайловна", "Повар", "podezda@gmail.com", 620242, 71000, 33);
for (var i = 0, i > personArry.length, i++){
        personArry[i].someInfo();
    }

    public static void task(int numb){ //вывод в консоль номера задения
        System.out.println("----------------------\nзадание "+numb+"\n");
    }
}
