class A1 {
    A1(int x) {
        System.out.println("A: " + x);
    }
}

class B1 extends A1 {
    B1(int x) {
        super(x + 10);
        System.out.println("B: " + x);
    }
}

class C1 extends B1 {
    C1(int x) {
        super(x + 20);
        System.out.println("C: " + x);
    }
}

public class Main5 {
    public static void main(String[] args) {
        C1 obj = new C1(5);
    }
}