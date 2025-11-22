class LL{
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next= null;
        }
    }
        public  void insertAtPos(int idx, int data){
            Node newNode = new Node(data);
            if(idx == 0){
                newNode.next=head;
                head = newNode;
                return;
            }
            Node temp = head;
            int count = 0;
            while(temp != null && count < idx-1){
                temp = temp.next;
                count++;
            }
            
            if(temp == null){
                System.out.println("invalid");
                return;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            
        }
     
        public void printList(){
            if (head==null){
              System.out.println("List is empty");
              return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;

            }
            System.out.println(" Null");
        }
        public static void main(String args[]){
            LL l1 = new LL();
            l1.insertAtPos(0,10);
             l1.insertAtPos(1,20);
             l1.insertAtPos(2,30);
            l1.insertAtPos(3,40);
            l1.printList();
        }
    
}
