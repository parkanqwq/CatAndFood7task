package com.company;

public class Cat {

    private String name;
    private int appetite;
    private boolean catFull;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate){
        if (catFull == false) {
            plate.decreaseFood(appetite);
            catFull = true;
            System.out.printf("Котик %s покушал\n", name);
        } else System.out.println("Я уже сыт!");
    }

    public boolean getCatFull() {
        return catFull;
    }

    public String getName() {
        return name;
    }
}
