package LeetCode;

public class SwapPairsInLL {

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

    public Node swapInPairs(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node dummyHead = new Node("");
        dummyHead.next = head;
        Node prevNode = dummyHead;

        while(prevNode.next!=null && prevNode.next.next!=null){
            Node currNode = prevNode.next;
            Node nextNode = prevNode.next.next;
            
            currNode.next = nextNode.next;
            nextNode.next = currNode;
            prevNode.next = nextNode;

            prevNode = currNode;
        }
        return dummyHead.next;

    }

    public Node SwapWithValuesCHanged(Node head){
        if (head==null || head.next==null){
            return head;
        }
        Node temp = head;
        while (temp!=null && temp.next!=null){
            String tempVal = temp.data;
            temp.data = temp.next.data;
            temp.next.data = tempVal;

            temp = temp.next.next;
        }
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
        SwapPairsInLL ll = new SwapPairsInLL();
        // ll.addFirst("f");
        ll.addFirst("e");
        ll.addFirst("d");
        ll.addFirst("c");
        ll.addFirst("b");
        ll.addFirst("a");

        ll.printList();
        System.out.println();
        ll.head = ll.swapInPairs(ll.head);
        ll.printList();
        // ll.head = ll.SwapWithValuesCHanged(ll.head);
        // ll.printList();
        
        
    }
}
