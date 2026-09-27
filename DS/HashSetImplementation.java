import java.util.concurrent.CountDownLatch;

import javax.management.ObjectName;

class Node {
    Object data;
    Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class HashSet {
    Node[] hashArray = new Node[10];
    int count = 0;

    boolean add(Object data) {
        Node temp = null;
        int index = Math.abs(data.hashCode() % hashArray.length);
        Node curr = hashArray[index];
        Node newNode = new Node(data);

        if (hashArray[index] == null) {
            hashArray[index] = newNode;
            count++;
            return true;
        }
        while (curr != null) {
            if (curr.data.equals(data)) {
                return false;
            }
            temp = curr;
            curr = curr.next;
        }
        temp.next = newNode;
        count++;
        return true;
    }

    boolean remove(Object data) {
        Node temp = null;
        int index = Math.abs(data.hashCode() % hashArray.length);
        Node curr = hashArray[index];

        while (curr != null) {
            if (curr.data.equals(data)) {
                if (temp == null) {
                    hashArray[index] = curr.next;
                    count--;
                    return true;
                }
                temp.next = temp.next.next;
                count--;
                return true;
            }
            temp = curr;
            curr = curr.next;
        }
        return false;
    }
}

public class HashSetImplementation {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        System.out.println(hs.add(10));
        System.out.println(hs.add(20));
        System.out.println(hs.add(30));

    }
}
