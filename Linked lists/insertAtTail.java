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
    
    
     public void insertAtTail(int data){
        Node newNode = new Node(data);
       if(head == null){
           head = newNode;
           return;
       }
     
       Node currNode = head;
       while(currNode.next != null){
           currNode = currNode.next;
       }
       currNode.next = newNode;
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
        
        l1.insertAtTail(6);
        
        l1.display();
        
    }
}
