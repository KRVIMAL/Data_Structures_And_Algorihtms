package CollectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LearnArrayList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        List<Integer> newList=new ArrayList<>();

        System.out.println(newList.add(100));
        System.out.println(newList.add(90));

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
        System.out.println(list.addAll(newList));
        System.out.println(list);
        System.out.println(newList.containsAll(list));
        for(int i=0;i< list.size();i++){
            System.out.println("element "+list.get(i));
        }
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for(Integer element:list){
            System.out.println("element "+element);
        }
    }
}
