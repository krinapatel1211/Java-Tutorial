package LeetCode;

public class RotateLL24 {
    
    Node head;
        
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }

    public Node rotateListBy(Node head, int n){
        if (head==null || head.next==null){
            return head;
        }
        int length = 1;
        Node tail = head;
        
        while (tail.next!=null){
            tail = tail.next;
            length++;
        }
        tail.next = head;
        int count =1;
        while (count!=length-n){
            head = head.next;
            tail = tail.next;
            count++;
        }
        tail.next = null;
        return head;

    }

    public void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        RotateLL24 list = new RotateLL24();

        list.addFirst("f");
        list.addFirst("e");
        list.addFirst("d");
        list.addFirst("c");
        list.addFirst("b");
        list.addFirst("a");

        list.printList();
        System.out.println();

        list.head = list.rotateListBy(list.head, 2);
        list.printList();
    }   
    
}
