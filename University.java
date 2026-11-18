class University {
    String universityName;

    University(String name) {
        universityName = name;
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
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

    class Faculty {
        String facultyName;
        String designation;

        Faculty(String name, String designation) {
            facultyName = name;
            this.designation = designation;
        }

        void display() {
            System.out.println("Faculty: " + facultyName);
            System.out.println("Designation: " + designation);
            System.out.println("University: " + universityName);
        }
    }

    public static void main(String[] args) {

        University.Department d =
                new University.Department("Computer Science");

        University u = new University("ABC University");

        University.Faculty f =
                u.new Faculty("Rahul", "Professor");

        u.displayUniversity();
        d.display();
        f.display();
    }
}