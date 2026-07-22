public class staticAndNonStaticVariable {
    static int i = 10; // static variable
    int j = 20; // non static variable

    public static void main(String[] args) {
        int k = 30; // local variable
        staticAndNonStaticVariable a = new staticAndNonStaticVariable();
        System.out.println(staticAndNonStaticVariable.i);// or System.out.println(i);
        System.out.println(a.j);
        System.out.println(k);

        int i = 100;
        System.out.println(i);
    }
}
