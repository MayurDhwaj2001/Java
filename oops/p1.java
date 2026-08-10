// copy one oblect to another object copies only the address of the 1st object ..changing one will change both the data ie.
// 
// Book Book2 = Book1;
// Book1----1x01
// Book2----1x01
// both has same address
// 
// changing on will affect both 
// only one book is created in storage 
// 
class Book {
    int pages;
}

public class p1 {
    public static void main(String[] args) {
        Book b1;
        b1 = new Book();
        b1.pages = 250;
        System.out.println(b1.pages);

        Book b2 = b1; // b1 address is stored in b2 object
        b2.pages = 350;
        System.out.println(b2);
        System.out.println(b1);

        b2 = null;
        System.out.println(b2.pages); // null pointer exception at runtime
    }
}
