package lesson6;

  abstract class Animal {

    protected String name;
    protected int run;
    protected int swim;
    public static int count;

    public Animal() {
    }
    public void animalInfo() {
      count++;
      System.out.println("Животное " + count);
    }
    public void doRun () {

    }
    public void doSwim () {
      System.out.println("не умеет плавать");
    }
}

