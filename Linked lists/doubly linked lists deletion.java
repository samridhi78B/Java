class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.prev=null;
            this.next = null;
        }
    }

    public void insertAtGivenIndex(int data, int idx){
         Node newNode = new Node(data);
        if (idx == 0) {
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        return;
    }
        Node temp = head;
        int count=0;
        
        while(temp!=null  && count < idx-1){
            temp=temp.next;
            count++;
        }
        if(temp == null) System.out.print("Index out of bound");
        
         if (temp.next == null) {
        temp.next = newNode;
        newNode.prev = temp;
        return;
    }
        
        newNode.next=temp.next;
        newNode.prev = temp;
        temp.next.prev=newNode;
         temp.next= newNode;
    }
    
    
    
    //deletion
      public void deleteAtHead(){
        if(head==null){
        return;
        }
        if (head.next == null) {
        head = null;
        return;
        }
        head=head.next;
        head.prev = null;
    }
      
    //deletion 
    public void deleteAtTail(){
        if(head==null){
        return;
        }
        if (head.next == null) {
        head = null;
        return;
        }
        Node temp =head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.prev.next=null;
        
    }
       
       public void deleteAtGivenIndex(int idx){
           if (head == null) return;
             if (idx == 0) {
             head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Node temp = head;
        int count=0;
        
        while(temp!=null  && count < idx-1){
            temp=temp.next;
            count++;
        }
        if(temp == null || temp.next == null) {
            System.out.print("Index out of bound"); 
            return;
        }
        Node nodeToDelete = temp.next;
       if (nodeToDelete.next == null) {
        temp.next = null;
        return;
    }  temp.next = nodeToDelete.next;
    nodeToDelete.next.prev = temp;
           
       }
       
    
    
    //display
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
	LL l1 = new LL();
    l1.insertAtGivenIndex(0,0);
    l1.insertAtGivenIndex(1,1);
    l1.insertAtGivenIndex(2,2);
    l1.insertAtGivenIndex(3,3);
    l1.insertAtGivenIndex(4,4);
    l1.deleteAtHead();
    l1.deleteAtTail();
    l1.deleteAtGivenIndex(1);
	l1.display();
	}
}
