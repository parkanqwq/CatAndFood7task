package com.company;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n){
        if (n > food) System.out.println("В тарелке не хватает еды, чтоб кот насытился");
        else food -= n;
    }

    public void info(){
        System.out.println("в тарелке еды: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if (food <= 0) {
            System.out.println("В тарелку можно положить еды только больше ноля!");
            return;
        }
        if (getFood() + food > 30) {
            System.out.printf("Вы наполнили тарелку доверха и у вас осталось %s еды\n", this.food + food - 30);
            this.food = 30;
        } else {
            System.out.println("Вы наполнили тарелку");
            this.food = getFood() + food;
        }

    }
}
