package lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Обжора", 100);
        Cat cat2 = new Cat("Том", 15);
        Cat cat3 = new Cat("Балам", 60);

        Cat[] cats = {cat1, cat2, cat3};
        Plate plate = new Plate(90);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].info();
        }

        plate.info();

    }
}
