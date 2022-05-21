package lesson6;

class Cat extends Animal {

    public Cat (String name, int run) {
        this.name = name;
        this.run = run;
    }
    public void catInfo () {
        System.out.println("Кот " + name);
    }

    @Override
    public void doRun() {
        if (run <= 200) {
            System.out.println("пробежал " + run + " м");
        } else {
            System.out.println("не может пробежать больше 200 м");
        }
    }
}


