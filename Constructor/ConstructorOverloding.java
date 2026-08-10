
class Box {
    int length, bredth, height;

    Box(int l, int b, int h) {
        length = l;
        bredth = b;
        height = h;
    }

    Box(int i) {
        length = i;
        bredth = i;
        height = i;
    }

    void getBox() {
        System.out.println("[" + length + ", " + bredth + ", " + height + "]");
    }
}

public class ConstructorOverloding {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box(10, 20, 30);
        b1.getBox();
        b2.getBox();
    }
}
