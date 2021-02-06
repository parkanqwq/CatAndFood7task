package com.company;

public class Main {

    private static Cat[] cat = new Cat[5];
    private static Plate plate = new Plate(30);

    public static void main(String[] args) {

        System.out.println();
        plate.info();
        System.out.println();

        createCat();
        catEating();

        plate.setFood(5);
        plate.info();

    }

    private static void catEating(){
        for (int i = 0; i < cat.length; i++) {
            System.out.println(cat[i].getName() + " сытость " + cat[i].getCatFull());
            cat[i].eat(plate);
            System.out.println(cat[i].getName() + " сытость " + cat[i].getCatFull());
            plate.info();
            System.out.println();
        }
    }

    private static void createCat(){
        cat[0] = new Cat("Масик", 3);
        cat[1] = new Cat("Жекит", 5);
        cat[2] = new Cat("Крутить", 2);
        cat[3] = new Cat("Пеник", 6);
        cat[4] = new Cat("Сахарок", 4);
    }
}
