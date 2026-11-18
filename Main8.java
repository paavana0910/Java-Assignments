class Person1 {
    private String name;
    private int age;

    static int count = 0;
    static final String COLLEGE = "ABC College";

    Person1(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Overloaded method
    void displayDetails(boolean showCollege) {
        displayDetails();

        if (showCollege) {
            System.out.println("College: " + COLLEGE);
        }
    }

    static class Department {
        String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void display() {
            System.out.println("Department: " + departmentName);
        }
    }
}

class Student1 extends Person1 {
    String usn;
    String course;

    Student1(String name, int age, String usn, String course) {
        super(name, age);
        this.usn = usn;
        this.course = course;
    }

    @Override
    void displayDetails() {
        System.out.println("Student: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person1 {
    String subject;
    double salary;

    Faculty(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    void displayDetails() {
        System.out.println("Faculty: " + getName());
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

class Administrator extends Person1 {
    String role;

    Administrator(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    void displayDetails() {
        System.out.println("Administrator: " + getName());
        System.out.println("Role: " + role);
    }
}

public class Main8 {
    public static void main(String[] args) {

        Person1[] people = {
                new Student1("Anu", 20, "CS101", "BCA"),
                new Faculty("Meera", 40, "Java", 50000),
                new Administrator("Ravi", 45, "Manager")
        };

        for (Person1 p : people) {
            p.displayDetails();
            System.out.println();
        }

        Person1.Department d =
                new Person1.Department("Computer Science");

        d.display();

        System.out.println("Total People: " + Person1.count);
        System.out.println("College: " + Person1.COLLEGE);

        people[0].displayDetails(true);
    }
}