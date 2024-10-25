package HackerRank_Problems;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class SockMerchant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Map<Integer,Integer>hash=new HashMap<>();
        int result=sockMerchant(arr, hash);
        System.out.println(result);
        sc.close();
    }
    public static int sockMerchant(int[] arr,Map<Integer,Integer>hash){
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(hash.containsKey(num)){
                hash.put(num,hash.get(num)+1);
            }
            else{
                hash.put(num,1);
            }
        }
        int count=0;
        for(Integer key:hash.values()){
                count+=key/2;
        }
        return count;
    }
}