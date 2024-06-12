package LeetCode;

public class RemoveDuplicatesfromSortedList83 {
    Node head;

    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        // size++;
    }

    //addLast
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // printLinkedList
    public void printLinkedList(){
        if (head == null){
            System.out.println("LIst is Empty!");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        
    }
}
