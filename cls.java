class dog {
    static void bark() {
        System.out.println("Dog is Barking ");
    }
}

public class cls {

    public static void person() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        demo a1 = new demo();
        System.out.println(a1);
        person();

        dog d1 = new dog();
        d1.bark();
    }
}
