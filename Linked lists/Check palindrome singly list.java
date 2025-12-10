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

    public void insertAtGivenIndex(int data, int idx) {
    Node newNode = new Node(data);

    if (idx == 0) {
        newNode.next = head;
        if (head != null) head.prev = newNode;
        head = newNode;
        return;
    }

    Node temp = head;
    int count = 0;

    while (temp != null && count < idx - 1) {
        temp = temp.next;
        count++;
    }

    if (temp == null) {
        System.out.println("Index out of bound");
        return;
    }


    if (temp.next == null) {
        temp.next = newNode;
        newNode.prev = temp;
        return;
    }

    newNode.next = temp.next;
    newNode.prev = temp;
    temp.next.prev = newNode;
    temp.next = newNode;
}

 public Node rev(Node head){
     Node curr=head;
     Node prev=null;
     Node newNode;
     while(curr != null){
         newNode=curr.next;
         curr.next=prev;
         prev=curr;
         curr=newNode;
     }
     return prev;
 }   
  public boolean isPal() {
      Node temp = head;
      Node slow=head;
      Node fast = head;
      while(fast.next != null && fast.next.next != null){
          slow=slow.next;
          fast=fast.next.next;
      }
      Node a = rev(slow.next);
      while(a != null){
          if(temp.data != a.data) return false;
          a=a.next;
          temp=temp.next;
      }
      return true;
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
    l1.insertAtGivenIndex(1,0);
    l1.insertAtGivenIndex(1,1);
    l1.insertAtGivenIndex(2,2);
    l1.insertAtGivenIndex(2,3);
    l1.insertAtGivenIndex(3,4);
    l1.insertAtGivenIndex(1,5);
    if(l1.isPal()) System.out.println("YES");
    else System.out.println("NO");
	l1.display();
	}
}
