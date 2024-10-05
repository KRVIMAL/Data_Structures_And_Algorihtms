package CollectionFramework;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
public class LearnPriorityQueue{
    public static void main(String[] args){
        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(34);
        pq.offer(43);
        pq.offer(3);
        pq.offer(433);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);

    }
}
/*
1.priority queue by default implements the min heap in which the smallest element comes first .
but we can also change this behaviour by passing a comparator function in the constructor of the priority queue.

 */

