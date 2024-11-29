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
   public static void findFrequency(int[] arr){
       HashMap<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           int g=mp.getOrDefault(arr[i],0);
           mp.put(arr[i],g+1);
       }
     Iterator<Integer>iterator=mp.values().iterator();;
     int maxFrequency=iterator.next();
     int minFrequency=maxFrequency;
     while (iterator.hasNext()){
         int frequency=iterator.next();
         if(maxFrequency<frequency){
             maxFrequency=frequency;
         }
         if(minFrequency>frequency){
             minFrequency=frequency;
         }
     }
       System.out.println(maxFrequency+"maxFrequency");
       System.out.println(minFrequency+"minFrequency");
   }
}
