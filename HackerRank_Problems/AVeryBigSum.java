package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class AVeryBigSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        long result=aVeryBigSum(list);
        System.out.println(result);
    }
    public static long aVeryBigSum(ArrayList<Integer>ar){
        long sum=0;
        for(int i=0;i<ar.size();i++){
            sum+=ar.get(i);
        }
        return sum;
    }
}
