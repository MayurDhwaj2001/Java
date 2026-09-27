class node {
    Object data;
    node next;

    node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {

    node head = null;

    void add(Object data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    void print() {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.print();
        ll.add(2);
        ll.add(2);
        ll.add(2);
        ll.print();
    }
}
