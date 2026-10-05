class Student {
    String name;
    int age;
    int rollNo;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 18;
        s1.rollNo = 101;

        Student s2 = new Student();
        s2.name = "Priya";
        s2.age = 19;
        s2.rollNo = 102;

        Student s3 = new Student();
        s3.name = "Arjun";
        s3.age = 18;
        s3.rollNo = 103;

        s1.display();
        s2.display();
        s3.display();
    }
}