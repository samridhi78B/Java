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

    
  public boolean isPal() {
    if (head == null || head.next == null) 
        return true;

    Node left = head;
    Node right = head;

    // Move right to end
    while (right.next != null) {
        right = right.next;
    }

    // Compare from both ends
    while (left != right) {
        if (left.data != right.data)
            return false;

        left = left.next;
        right = right.prev;
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
    l1.insertAtGivenIndex(1,4);
    l1.insertAtGivenIndex(1,5);
    if(l1.isPal()) System.out.println("YES");
    else System.out.println("NO");
	l1.display();
	}
}
