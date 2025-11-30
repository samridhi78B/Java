
import java.util.*;
class LL {
        Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head= newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public int findNode(int n){
        Node slow = head;
        Node fast = head;
        for(int i=0;i<n;i++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        while( fast != null)
        {
            slow = slow.next;
            fast= fast.next;
        }
        return slow.data;
    }
    public static void main(String[] args) {
        LL l1 = new LL();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i=0;i<size;i++){
            int val = sc.nextInt();
            l1.insertAtEnd(val);
        }
        int n = sc.nextInt();
        int d = l1.findNode(n);
        if(d== -1) System.out.print("Out of bound");
       else  System.out.print(d);
        
    }
}
