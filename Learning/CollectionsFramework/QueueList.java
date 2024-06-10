
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueList {
    public static void main(String[] args) {
        //Queue data structure
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.offer(15);
        queue.offer(20);
        queue.offer(25);
        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());


        //DEQUE DAta Structure
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(10);
        deque.offerFirst(5);
        deque.offerLast(20);
        deque.offer(25);
        deque.offer(10);
        deque.pollLast();
        deque.removeFirstOccurrence(10);
        System.out.println(deque);

        //PRIORITY QUEUE Data Structure
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(5);
        pQueue.offer(10);
        pQueue.offer(2);
        pQueue.offer(4);
        pQueue.remove();
        System.out.println(pQueue.peek());
        System.out.println(pQueue);

        PriorityQueue<Integer> pQueueMax = new PriorityQueue<>(Comparator.reverseOrder());
        pQueueMax.add(5);
        pQueueMax.offer(10);
        pQueueMax.offer(2);
        pQueueMax.offer(4);
        System.out.println(pQueueMax.peek());
        pQueueMax.remove();
        System.out.println(pQueueMax);

    }
}
