package lesson6;

class Dog extends Animal {

    public Dog (String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;

    }
    public void dogInfo() {
        System.out.println("Пёс " + name);
    }

    @Override
    public void doRun() {
        if (run <= 500) {
            System.out.println("пробежал " + run + " м");
        } else {
            System.out.println("не может пробежать больше 500 м");
            }
        }
    @Override
    public void doSwim() {
        if (swim <= 10) {
            System.out.println("проплыл " + swim + " м");
            } else {
            System.out.println("не может проплыть больше 10 м");
        }
    }
}

