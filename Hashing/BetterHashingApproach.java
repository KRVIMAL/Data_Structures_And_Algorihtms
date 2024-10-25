package Hashing;

import java.util.Scanner;

public class BetterHashingApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        int[] hash=new int[51];

        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            hash[array[i]]=hash[array[i]]+1;
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int query=sc.nextInt();
            int count=hash[query];
            System.out.println(count);
        }
    }
}
