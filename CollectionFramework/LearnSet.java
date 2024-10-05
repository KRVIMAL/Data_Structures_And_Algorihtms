package CollectionFramework;
import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(6);
        set.add(0);
        System.out.println(set);
        System.out.println(set);
    }
}


/*
1.In set we cannot store duplicate elements.
2.In set there is no particular order to store the element is defined
 */