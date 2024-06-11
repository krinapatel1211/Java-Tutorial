public class LinkedList_1 {
    Node head;
    private int size;  
    
    LinkedList_1(){
        this.size = 0;
    }
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
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
        size++;
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

    // Delete 
    public void deleteFirst(){
        if (head == null){
            System.out.println("Nothing to delete, its Empty!");
            return;
        }
        size--;
        head = head.next;
    }

    // Delete 
    public void deleteLast(){
        if (head == null){
            System.out.println("Nothing to delete, its Empty!");
            return;
        }   
        size--;
        Node currentNode = head;
        Node previousNode = head;
        while (currentNode.next != null){
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = null;

    }

    // add element at specific index
    public void addAtSpecificIndex(int index, String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        if (head.next==null){
            if (index==0){
                newNode.next = head;
                head = newNode;
            }
            else{
                System.out.println("Specific position not found!");
            }
            return;
        }
        int count = 1;
        Node currentNode = head;
        while(currentNode.next!=null){
            if(count==index){
                break;
            }
            currentNode = currentNode.next;
            count++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;
    }
    // size of Linked LIst
    public int getSize(){
        return size;
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
        LinkedList_1 list = new LinkedList_1();
        list.addFirst("Krina");
        list.addFirst("is");
        list.addFirst("This");

        // list.printLinkedList();

        list.addLast("Laptop!");
        list.addLast("Do Not");
        list.addLast("Touch");

        list.printLinkedList();
        
        list.deleteFirst();
        list.printLinkedList();

        list.deleteLast();
        list.printLinkedList();
        System.out.println(list.getSize());

        list.addAtSpecificIndex(2, "New");
        list.printLinkedList();

        list.deleteLast();list.deleteLast();list.deleteLast();list.deleteLast();
        list.printLinkedList();

        list.addAtSpecificIndex(0, "New");
        list.printLinkedList();

    }    
}
