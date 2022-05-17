package lesson5;

public class Employee {
    private String name;
    private String profession;
    private String email;
    private int tel;
    private double salary;
    private int age;
    private static int count = 0;


    public double getBonus () {
        return salary * 1.5;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSalary (double salary) {    // сеттер (изменение значения у приватного поля)
        this.salary = salary;
    }

    public double getSalary () {               // геттер (получение значения у приватного поля)
        return salary;
    }

    public Employee(String name, String profession, String email, int tel, double salary, int age) {
        this.name = name;
        this.profession = profession;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
        this.age = age;
        count++;
        this.print();
    }

    public void print() {
        System.out.println("Сотрудник " + count);
        System.out.println("ФИО: " + name + "\t Должность: " + profession);
        System.out.println("E-mail: " + email + "\t Tel: " + tel);
        System.out.println("Зарплата: " + salary + " руб");
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}
