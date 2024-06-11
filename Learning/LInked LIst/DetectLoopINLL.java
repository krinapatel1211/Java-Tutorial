
public class DetectLoopINLL {
    Node head;

    public class Node{
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
        // size++;
    }

    public static void main(String[] args) {
        DetectLoopINLL list = new DetectLoopINLL();
        list.addFirst("Krina");

    }
}
