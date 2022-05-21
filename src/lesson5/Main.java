package lesson5;

public class Main {
    /*
    1.Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    2.Конструктор класса должен заполнять эти поля при создании объекта.
    3.Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    4.Создать массив из 5 сотрудников.
    5.С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    */
    public static void main(String[] args) {

        //Employee1
        Employee employee1 = new Employee("Иванов Иван Петрович","QA Engineer","ivivan@mailbox.com",
                892312312, 120000,21);

        //Employee2
        Employee employee2 = new Employee("Борисов Петр Львович","QA Engineer","bopetr@mailbox.com",
                890012312, 60000, 19);
        employee2.setSalary(80000);
        //Employee3
        Employee employee3 = new Employee("Сидоров Аркадий Петрович","Lead QA Engineer","sidor@mailbox.com",
                895212312, 200000, 45);
        employee3.setSalary(100000);
        //Employee4
        Employee employee4 = new Employee("Мамонтов Петр Алексеевич", "Java Developer", "mamont@mailbox.com",
                895214582, 250000, 42);

        //Employee5
        Employee employee5 = new Employee("Парфенов Игорь Валентинович", "Java Developer", "svech@mailbox.com",
                890414582, 140000, 38);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        for (int i = 0; i < employees.length; i++ ) {
            System.out.println(employees[i].getBonus() + " начислена премия сотруднику: " + employees[i].getName() +
                    " с изначальной зарплатой " + employees[i].getSalary());
        }
        System.out.println("Всего сотрудников " + Employee.getCount());
        System.out.println("-------------------------------------------------------------------------------------------" +
                "-------");
        System.out.println("Сотрудники старше 40 лет:");
        for (int j = 0; j < employees.length; j++) {
            if (employees[j].getAge() > 40) {
                System.out.println(employees[j].getName() + " (" + employees[j].getAge() + ")");
            }
        }
    }
}
