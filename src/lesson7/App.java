package lesson7;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Обжора", 100);
        Cat cat2 = new Cat("Том", 15);
        Cat cat3 = new Cat("Балам", 60);

        Cat[] cats = {cat1, cat2, cat3};
        System.out.print("В доме живут 3 кота: Обжора, Том и Балам.  И они очень проголодались.\nДавайте попробуем их накормить!");
        System.out.println("");
        System.out.println("Сколько еды положить в миску?");
        Scanner sc = new Scanner(System.in);
        int inputFood = sc.nextInt();
        Plate plate = new Plate(inputFood);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }
        plate.info();
        System.out.println("the end");
    }
}
