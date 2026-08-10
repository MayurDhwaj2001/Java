class A {
    A() {
        // this;
        System.out.println("A()");
    }

    A(int i) {
        this();
        System.out.println("A(int)");
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        new A(12);
    }
}
