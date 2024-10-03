package CollectionFramework;
import java.util.ArrayList;
public class LearnArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(list.add(1));
        System.out.println(list.add(2));
        System.out.println(list.add(3));
        System.out.println(list);
        System.out.println(list.add(4));
        System.out.println(list.add(5));
        System.out.println(list.get(2));
        System.out.println(list.remove(3));
        System.out.println(list);
        System.out.println(list.set(3,9));
        System.out.println(list);

    }
}
