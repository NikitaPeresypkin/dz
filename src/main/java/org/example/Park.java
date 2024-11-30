package org.example;

public class Park {

    String namePark, address;

    Attractions attraction1 = new Attractions("Карусель", "11:00-18:00", 200);
    Attractions attraction2 = new Attractions("BlueWater", "11:30-18:30", 700);
// Хотел создать масив вложеных класов чтобы цыклом выводить в консоль все атракционы в парке, но незаработало
// Attractions [] arr = new Attractions [2];
//arr[0]=new Attractions("Volcano", "11:10-18:30", 600)
    public Park(String name, String address) {
        this.namePark = name;
        this.address = address;
    }
    class Attractions {
        String name, workingHours;
        int prise;

        public Attractions(String name, String workingHours, int prise) {
            this.name = name;
            this.workingHours = workingHours;
            this.prise = prise;
        }
    }
    public void parkAttractionsInfo() {
        System.out.println("Парки атракционов: ");
        System.out.println("Название парка: "+ namePark + " ");
        System.out.println("Адрес: "+address + "\n");
        System.out.println("Название атракциона: "+attraction1.name+" ");
        System.out.println("время работы: "+attraction1.workingHours+" ");
        System.out.println("Стоимость билета: "+attraction1.prise+"\n");
        System.out.println("Название атракциона: "+attraction2.name+" ");
        System.out.println("время работы: "+ attraction2.workingHours+" ");
        System.out.println("Стоимость билета: "+attraction2.prise+"\n");
    }
}


