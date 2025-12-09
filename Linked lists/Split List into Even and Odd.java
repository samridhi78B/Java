class LL {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // Insert at end
    public void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    // Display a list
    public void display(Node head) {
        Node temp = head;         
        while (temp != null) {
            System.out.print(temp.data + " -> "); 
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Split odd & even
    public void split() {
        Node oH = null, oT = null;
        Node eH = null, eT = null;

        Node temp = head;   

        while (temp != null) {
            if (temp.data % 2 != 0) {        // ODD
                if (oH == null) oH = oT = temp;
                else {
                    oT.next = temp;
                    oT = oT.next;
                }
            } else {                         // EVEN
                if (eH == null) eH = eT = temp;
                else {
                    eT.next = temp;
                    eT = eT.next;
                }
            }
            temp = temp.next;
        }

        // Close both lists
        if (oT != null) oT.next = null;
        if (eT != null) eT.next = null;

        System.out.println("Odd List:");
        display(oH);

        System.out.println("Even List:");
        display(eH);
    }
}


public class Main {
    public static void main(String[] args) {

        LL list = new LL();

        for (int i = 1; i <= 9; i++)
            list.insert(i);

        System.out.println("Original List:");
        list.display(list.head);

        System.out.println("\nSplit Odd & Even Lists:");
        list.split();
    }
}
