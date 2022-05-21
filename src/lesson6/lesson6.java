package lesson6;

public class lesson6 {

    public static void main(String[] args) {

        Cat cat = new Cat ("Мурзик", 150);
        Dog dog = new Dog("Бобик", 501, 9);
        cat.animalInfo();
        cat.catInfo();
        cat.doRun();
        cat.doSwim();
        dog.animalInfo();
        dog.dogInfo();
        dog.doRun();
        dog.doSwim();
    }
}
