class person {
    int id;
    String name;
    private static int n = 101;

    person(String name) {
        System.out.println("--------------Person object created--------------");
        this.name = name;
        id = n++;
    }

    public void getDetails() {
        System.out.println("name=" + name + "\tid=" + id);

    }
}

public class p1 {
    public static void main(String[] args) {

        person p1 = new person("Mayur");
        p1.getDetails();

        person p2 = new person("Dhwaj");
        p2.getDetails();

    }
}
