class Person
{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee1 extends Person
{
    int id;
    double salary;

    Employee1(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
        System.out.println("Employee Constructor");
    }
}

class Manager extends Employee1 {
    String department;
    double bonus;

    Manager(String name, int age, int id, double salary,
            String department, double bonus) {

        super(name, age, id, salary);

        this.department = department;
        this.bonus = bonus;

        System.out.println("Manager Constructor");
    }

    void displayManager() {
        display();
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + (salary + bonus));
    }
}

public class Main3 {
    public static void main(String[] args) {

        Manager m = new Manager(
                "Rahul", 35, 101, 50000, "IT", 10000
        );

        m.displayManager();
    }
}
