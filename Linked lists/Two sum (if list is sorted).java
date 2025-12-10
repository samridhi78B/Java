import java.util.*;
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

 public String twoSum(int target){
    if(head == null) return "List is empty";
     Node temp = head;
     Node temp1=head;
     while(temp1.next != null){
         temp1=temp1.next;
     }
     while(temp != temp1 && temp1.next != temp)
     {
         int sum = temp.data+temp1.data;
         if(sum==target) {
             return temp.data + " " + temp1.data;
         }
         else if(sum > target){
             temp1 = temp1.prev;    
         }
         else{
            temp = temp.next;
         }
     }
     return "No pair found";
     
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
	    Scanner sc = new Scanner(System.in);
	LL l1 = new LL();
    l1.insertAtGivenIndex(3,0);
    l1.insertAtGivenIndex(4,1);
    l1.insertAtGivenIndex(4,2);
    l1.insertAtGivenIndex(5,3);
    l1.insertAtGivenIndex(13,4);
    l1.insertAtGivenIndex(100,5);
    int n = sc.nextInt();
    String k = l1.twoSum(n);
    System.out.println(k);
	l1.display();
	}
}
