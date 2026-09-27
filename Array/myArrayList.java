import java.util.Scanner;

class arrList {

    Object[] arr = new Object[10];
    int size = 0;

    // ADD
    public void add(int ele) {

        if (size < arr.length) {
            arr[size] = ele;
            size++;
            System.out.println("Added " + ele);
        } else {
            grow();

            arr[size] = ele;
            size++;
            System.out.println("Added " + ele);
        }
    }

    // GROW
    public void grow() {

        Object[] arr2 = new Object[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        arr = arr2;

        System.out.println(
                "Capacity increased. New capacity: " + arr.length);
    }

    // PRINT
    public void print() {

        if (size == 0) {
            System.out.println("No element");
            return;
        }

        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
    }

    // CONTAINS
    public void contains(int ele) {

        boolean found = false;

        for (int i = 0; i < size; i++) {

            if (arr[i].equals(ele)) {
                System.out.println(
                        "Element found at index: " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(
                    "Element " + ele + " not found: -1");
        }
    }

    // SIZE
    public void size() {
        System.out.println("Size is: " + size);
    }
}

public class myArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        arrList arrLst = new arrList();

        while (true) {

            System.out.println("\n===== MY ARRAYLIST =====");
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Contains");
            System.out.println("4. Size");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int input = sc.nextInt();

            switch (input) {

                case 1:
                    System.out.print("Enter element: ");
                    int ele = sc.nextInt();

                    arrLst.add(ele);
                    break;

                case 2:
                    arrLst.print();
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();

                    arrLst.contains(search);
                    break;

                case 4:
                    arrLst.size();
                    break;

                case 5:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}