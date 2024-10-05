package CollectionFramework;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
public class LearnArrayDeque{
    public static void main(String[] args){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(1);
        adq.offerFirst(2);
        adq.offerLast(3);
        adq.offer(44);
        adq.offer(54);
        System.out.println(adq);
        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq.pollFirst());
        System.out.println(adq.peekLast());

    }
}

/*
   1.offer and offerLast method work same which adds element in the last.
 */