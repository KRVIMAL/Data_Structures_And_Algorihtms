package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateElementWithKDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Boolean result=distace(arr,k);

        System.out.println(result);
    }
    public static boolean distace(int[] arr,int k){
        //        for(int i=0;i<arr.length;i++){
//            mp.put(arr[i],i);
//        }
//        System.out.println(mp+"mp");
        return true;
    }

}
