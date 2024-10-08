package CollectionFramework;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap{
    public static void main(String[] args){
//        Map<String,Integer>hm=new HashMap<>();
        Map<String,Integer>hm=new TreeMap<>();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.remove("Three");
        System.out.println(hm);
        System.out.println(hm.get("One"));
        System.out.println(hm.containsKey("Two"));
        System.out.println(hm.containsValue(2));
        System.out.println(hm.replace("Two",55));
        System.out.println(hm);
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        System.out.println(hm.hashCode());
        for(Map.Entry element:hm.entrySet()){
            String key = (String)element.getKey();
            int value=(int)element.getValue();
            System.out.println(key + " : " + value);

        }
    }
}


/*
1.map is an interface in the collection.
2.tree map uses binary search tree under the hood.
 */