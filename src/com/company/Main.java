package com.company;

public class Main {

    private static Cat[] cat = new Cat[5];
    private static Plate plate = new Plate(20);

    public static void main(String[] args) {

        System.out.println();
        plate.info();
        System.out.println();

        createCat();
        catEating();

        plate.setFood(13);
        plate.info();

    }

    private static void catEating(){
        for (int i = 0; i < cat.length; i++) {
            System.out.println("У котика " + cat[i].getName() + " сытость " + cat[i].getCatFull());
            cat[i].eat(plate);
            System.out.println("У котика " + cat[i].getName() + " сытость " + cat[i].getCatFull());
            plate.info();
            System.out.println();
        }
    }

    private static void createCat(){
        cat[0] = new Cat("Масик", 4);
        cat[1] = new Cat("Жекит", 6);
        cat[2] = new Cat("Крутить", 5);
        cat[3] = new Cat("Пеник", 7);
        cat[4] = new Cat("Сахарок", 3);
    }
}
