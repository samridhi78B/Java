class LL{
    Node head;
class Node{
    String data;
    Node next;
    Node( String data){
        this.data=data;
        this.next=null;
    }
}

public void addFirst(String data){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head= newNode;
}

public void addLast(String data){
    Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp =temp.next;
        }
        temp.next = newNode;
    
}

public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
         Node temp = head;
        while(temp != null){
             System.out.print(temp.data + " -> ");
            temp =temp.next;
        }
         System.out.print("null");
     
}

public void deleteFirst(){
        if(head==null){
         System.out.println("List is empty");
            return;
        }
        head = head.next;
    
}


public void deleteLast(){
   
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
         Node last = head.next;
         while(last.next != null){
             secondLast = last;
             last = last.next;
         }
            secondLast.next = null;
    
}

public static void main(String args[]){
    LL list = new LL();
    list.addFirst("is");
    list.addFirst("this");
     list.addLast("a");
     list.addLast("list");
        list.deleteFirst();
          list.deleteLast();
     list.printList();
}
}
