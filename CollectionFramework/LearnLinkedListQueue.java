package CollectionFramework;
import java.util.LinkedList;
import java.util.Queue;
public class LearnLinkedListQueue{
    public static void main(String[] args){
    Queue<Integer> queue=new LinkedList<>();
    queue.offer(12);
    queue.offer(121);
    queue.offer(33);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
         queue.clear();
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());//throws exception
    }
}