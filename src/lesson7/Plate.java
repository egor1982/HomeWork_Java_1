package lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public int getPlateDecrease(int appetite) {
        int spread = food - appetite;
        return spread;
    }

    public int plateIncrease() {
       Scanner sc = new Scanner(System.in);
       int action = sc.nextInt();
       food += action;

       System.out.println( "Количество еды в тарелке возросло до " + food);
       return action;
    }

    void info() {

        System.out.println("Количество еды в тарелке " + food);
    }
}