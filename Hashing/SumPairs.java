package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class SumPairs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Boolean result=isSumPairExists(arr,k);

        System.out.println(result);
    }
    public static boolean isSumPairExists(int[] arr,int k){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int g= mp.getOrDefault(arr[i],0);
            mp.put(arr[i],g+1);
        }
        System.out.println(mp+"hashmap");
        boolean result=false;
        for(Integer key: mp.keySet()){
            System.out.println(key+"key");
            System.out.println(mp.get(key)+"get");
            if(k==key+mp.get(key))
            {
                result= true;

            }
        }
        return  result;
    }
}
