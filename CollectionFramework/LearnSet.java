package CollectionFramework;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set=new HashSet<>();
//        Set<Integer>set= new LinkedHashSet<>();
        Set<Integer>set=new TreeSet<>();
        set.add(21);
        set.add(5);
        set.add(6);
        set.add(0);
        set.contains(9);
        boolean isContains= set.contains(0);
        System.out.println(isContains);

        System.out.println(set);
        System.out.println(set);
        System.out.println(set.size());

    }
}


/*
1.In set we cannot store duplicate elements.
2.In set there is no particular order to store the element is defined
3.LinkedHashSet is same as the HashSet but it can also implement the property of the linked list.
4.LinkedHashSet maintains the order of the elements.
5.TreeSet implements the property of a binary search tree that is why all the elements are stored in a sorted format.
 */
