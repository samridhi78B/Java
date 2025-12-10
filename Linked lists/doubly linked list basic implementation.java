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
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null){
        head= newNode;
        return;
    }
        
        newNode.next = head;
        head.prev=newNode;
        head=newNode;
        
    }
    
      public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(head==null){
        head= newNode;
        return;
    }
    Node temp=head;
    while(temp.next != null){
        temp=temp.next;
    }
        
        temp.next = newNode;
        newNode.prev=temp;
        newNode.next=null;
        
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
	l1.insertAtHead(3);
	l1.insertAtHead(2);
	l1.insertAtHead(1);
	l1.insertAtTail(10);
	l1.insertAtTail(20);
	l1.insertAtTail(50);
   l1.insertAtGivenIndex(100,2);
	l1.display();
	}
}
