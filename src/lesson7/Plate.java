package lesson7;

public class Plate {

    public int getFood() {
        return food;
    }

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Количество еды в миске " + food);
    }

    public void decreaseFood (int appetite) {
        food -= appetite;
    }
}
