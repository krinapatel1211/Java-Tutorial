public class LinkedList {

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

    public void printList(){
        Node node = head;
        while (node != null){
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("null");

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst("d");
        ll.addFirst("c");
        ll.addFirst("b");
        ll.addFirst("a");

        ll.printList();
        System.out.println();
        
        ll.addLast("e");
        ll.printList();

    }
}
