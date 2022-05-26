package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void info() {
        String fieldSatiety = !satiety ? "голоден" : "сыт";
        System.out.println(name + ": " + fieldSatiety);
    }

    void eat(Plate plate) {
        if (plate.getFood() >= appetite)
            satiety = true;
        plate.getPlateDecrease(appetite);
    }
}