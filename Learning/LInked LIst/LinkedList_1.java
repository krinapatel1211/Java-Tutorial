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

    //Reverse a linked list using Iterative approach
    public void reverseLLIterative(){
        if(head == null || head.next == null){
            return;
        }
        
        Node previousNode = head;
        Node currNode = head.next;
        
        while(currNode!= null){
            Node nextNode = currNode.next;
            currNode.next = previousNode;

            //update the 3 nodes and move one step
            previousNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    //Reverse a linked list using Recursive approach
    public Node reverseLLRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // removes nth Node from the End
    public Node removeNthNodeFromEnd(int n){
        if (head.next==null){
            return null;
        }
        
        int size = getSize();
        if (n==size){
            return head.next;
        }
        int count = 1;
        Node prevNode = head;
        while (count != size-n){
            prevNode = prevNode.next;
            count++;
        }
        prevNode.next = prevNode.next.next;
        return head;
    }

    //check LinkedList is palindrome or not
    public boolean isLLPalindrome(){
        // find the middle of LL
        if (head==null || head.next==null){
            return true;
        }
        // if list has 5 nodes mid = 2, if 5 nodes mod=3
        Node middleNode = findMiddle(head);
        Node secondHalfHead = reverseSecondHalf(middleNode.next);
        
        Node firstHalfHead = head;
        while(secondHalfHead != null){
            if (secondHalfHead.data != firstHalfHead.data){
                return false;
            }
            secondHalfHead = secondHalfHead.next;
            firstHalfHead = firstHalfHead.next;
        }

        return true;
    }

    public Node reverseSecondHalf(Node newHead){
        Node prevNode = newHead;
        Node currNode = newHead.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
    
            prevNode = currNode;
            currNode = nextNode;
        }
        newHead.next = null;
        return prevNode; 

    }
    public Node findMiddle(Node head){
        Node hare = head;
        Node turtle = head;
        while(hare.next != null && hare.next.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
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
        list.addFirst("Krina");
        list.addLast("is");
        list.addLast("Krina");
        // list.addLast("Krina");
        // list.printLinkedList();

        // list.addLast("Laptop!");
        // list.addLast("Do Not");
        // list.addLast("Touch");

        list.printLinkedList();
        
        // list.deleteFirst();
        // list.printLinkedList();

        // list.deleteLast();
        // list.printLinkedList();
        // System.out.println(list.getSize());

        // list.addAtSpecificIndex(2, "New");
        // list.printLinkedList();

        // list.deleteLast();list.deleteLast();list.deleteLast();list.deleteLast();
        // list.printLinkedList();

        // list.addAtSpecificIndex(0, "New");
        // list.printLinkedList();

        // list.reverseLLIterative();
        // list.printLinkedList();

        // list.head = list.reverseLLRecursive(list.head);
        // list.printLinkedList();

        // list.head = list.removeNthNodeFromEnd(6);
        // list.printLinkedList();

        // System.out.println(list.getSize());
        System.out.println(list.isLLPalindrome());

    }    
}
