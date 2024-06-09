package LeetCode;

public class Merge2LinkedList {
    Node head;
    public void addLast(Node node){
        if (head == null){
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node mergeLists(Node head1, Node head2){
        System.out.println(head1.data +  head2.data);

        Node temp = new Node(0);
        Node currentNode = temp;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                currentNode.next = head1;
                head1 = head1.next;
            }
            else{
                currentNode.next = head2;
                head2 = head2.next;
            }
            currentNode = currentNode.next;
        }

        if (head1 != null){
            currentNode.next = head1;
            head1= head1.next;
        }
        if (head2 != null){
            currentNode.next = head2;
            head2 = head2.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        
        Merge2LinkedList list1 = new Merge2LinkedList();
        list1.addLast(new Node(1));
        list1.addLast(new Node(3));
        list1.addLast(new Node(4));

        Merge2LinkedList list2 = new Merge2LinkedList();
        list2.addLast(new Node(1));
        list2.addLast(new Node(2));
        list2.addLast(new Node(4));

        // list1.printList();
        // list2.printList();

        list1.head = list1.mergeLists(list1.head, list2.head);
        list1.printList();
    }
}

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;    
    }
}