package lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Обжора", 100, false);
        Cat cat2 = new Cat("Том", 15, false);
        Cat cat3 = new Cat("Балам", 60,false);

        Cat[] cats = new Cat[] {cat1, cat2, cat3};
        System.out.println("В доме живут 3 кота:");
        for (int i = 0; i < cats.length; i++ ) {
            System.out.println(cats[i].getName());
        }

        Plate plate = new Plate(10);
        while (plate.getFood() < 100) {

        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }

        System.out.println("Сколько еды добавить в тарелку?");
        plate.plateIncrease();
        }

        System.out.println("Все коты накормлены и довольны");
    }
}