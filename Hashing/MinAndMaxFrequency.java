package Hashing;
import java.util.*;
import java.util.HashMap;

public class MinAndMaxFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        findFrequency(arr);
    }
   public static void findFrequency(int[] arr) {
       HashMap<Integer, Integer> mp = new HashMap<>();
       for (int i = 0; i < arr.length; i++) {
           int g = mp.getOrDefault(arr[i], 0);
           mp.put(arr[i], g + 1);
       }
       System.out.println(mp + "mp");
       int maxFrequency=Integer.MIN_VALUE;
       int minFrequency=Integer.MAX_VALUE;
       int maxElement=-1;
       int minElement=-1;
   for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
       int num=entry.getKey();
       int frequency=entry.getValue();
       if(frequency>maxFrequency){
           maxFrequency=frequency;
           maxElement=num;
       }
       if(frequency<minFrequency){
           minFrequency=frequency;
           minElement=num;
       }
   }
       System.out.println("Element with max frequency" + maxElement + "(Frequency:" + maxFrequency + ")");
       System.out.println("Element with min frequency" + minElement + "(Frequency:" + minFrequency + ")");

    }
}
