package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        ArrayList<Long>arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextLong());
        }
        Collections.sort(arr);
        miniMaxSum(arr);

    }
    public static void miniMaxSum(ArrayList<Long>arr){
        System.out.println(arr);
        Long sum= 0L;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.print(sum-arr.getLast() + " " );
        System.out.print(sum-arr.getFirst());
    }
}
