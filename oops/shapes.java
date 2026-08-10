class Circle {
    int radius;

    void init(int radius) {
        this.radius = radius;
    }

    void display() {
        System.out.println(radius);
    }
}

public class shapes {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.init(1);
        c1.display();
    }
}
