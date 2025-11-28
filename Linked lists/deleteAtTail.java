// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    Node head;
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next = null;
        }
    }
    
    
    public void insertAtHead(int data){
        Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           return;
       }
        newNode.next = head;
        head = newNode;
    }

    
    public void deleteAtTail(){
          if(head == null){
        System.out.print("List is empty");
       }
       Node secondlast = head;
       Node last = head.next;
       while(last.next != null){
           secondlast = secondlast.next;
           last = last.next;
       }
       secondlast.next= null;
    }
    public void display(){
        if(head == null){
           System.out.println("List is empty");
       }
       Node currNode = head;
       while(currNode != null){
           System.out.print(currNode.data + " -> ");
           currNode = currNode.next;
       }
        System.out.print("null");
    }
    
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertAtHead(5);
        l1.insertAtHead(4);
        l1.insertAtHead(3);
        l1.insertAtHead(2);
        l1.insertAtHead(1);
        
        l1.deleteAtTail();
        l1.display();
        
    }
}
