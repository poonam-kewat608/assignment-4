class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListSearch {
    // Function to perform linear search in the linked list
    public static boolean linearSearch(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // Creating the linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("Linked List:");
        printList(head);

        // Searching for an element
        int key = 30;
        if (linearSearch(head, key)) {
            System.out.println("Element " + key + " found in the linked list.");
        } else {
            System.out.println("Element " + key + " not found in the linked list.");
        }
    }
}