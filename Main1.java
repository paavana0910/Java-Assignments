class Employee
{
    int id;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        basicSalary = salary;
    }

    double calculateSalary() {
        return basicSalary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee
{
    double allowance, bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {
        super(id, name, salary);
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary()
    {
        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {
    int hours;
    double rate;

    ContractEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hours = hours;
        this.rate = rate;
    }

    @Override
    double calculateSalary() {
        return hours * rate;
    }
}

public class Main1 {
    public static void main(String[] args) {

        Employee[] emp = {
                new PermanentEmployee(101, "Asha", 30000, 5000, 3000),
                new ContractEmployee(102, "Ravi", 160, 250)
        };

        for (Employee e : emp) {
            e.display();
            System.out.println();
        }
    }
}