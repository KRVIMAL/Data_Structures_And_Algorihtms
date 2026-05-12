package Hashing;
import java.util.*;

public class FrequencyCounter{
    public static <Hashmap> void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer, Integer> result=frequency(arr);
        System.out.println(result+"result");
    }

    public static HashMap<Integer,Integer> frequency(int[] arr){

       HashMap<Integer,Integer> mp=new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            int g=mp.getOrDefault(arr[i],0);
//            mp.put(arr[i],g+1);
//        }

        return mp;
    }
}