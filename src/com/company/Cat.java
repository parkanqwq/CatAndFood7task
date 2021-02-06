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
            if (appetite > plate.getFood()) {
                System.out.printf("В тарелке не хватает еды, чтоб котик %s насытился\n", name);
                return;
            }
            plate.decreaseFood(appetite);
            catFull = true;
            System.out.printf("Котик %s покушал %s еды\n", name, appetite);
        } else System.out.println("Я уже сыт!");
    }

    public boolean getCatFull() {
        return catFull;
    }

    public String getName() {
        return name;
    }
}
