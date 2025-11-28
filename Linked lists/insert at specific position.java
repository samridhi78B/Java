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

    public void insertion(int idx, int data){
         Node newNode = new Node(data);
         
       if(idx == 0){
        newNode.next = head;
        head = newNode;
        return;
       }
       
        if(head == null){
           head = newNode;
           return;
       }
       

       int count=0;
       Node currNode = head;
        
       while(currNode != null && count < idx-1){
           currNode = currNode.next;
           count++;
       }
       newNode.next = currNode.next;
       currNode.next = newNode;
      
      if(currNode == null){
            return;
        }
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
    l1.insertion(0,1);
    l1.insertion(1,2);
    l1.insertion(2,3);
    l1.insertion(3,4);
    l1.display();
        
    }
}
