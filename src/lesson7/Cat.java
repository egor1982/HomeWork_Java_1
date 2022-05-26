package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void info () {
        System.out.println("Кот по кличке " + name + " с аппетитом " + appetite);
        if (satiety) {
            System.out.println("наелся и доволен! :)");
        } else {
            System.out.println("голоден :(");
        }
        System.out.println("");
    }

    public void eat (Plate plate) {
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            satiety = true;
        }
    }
}
