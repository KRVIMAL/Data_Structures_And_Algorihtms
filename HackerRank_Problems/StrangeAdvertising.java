package HackerRank_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class StrangeAdvertising {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

    int result=viralAdvertising(n);
        System.out.println(result);
    }
    public static int  viralAdvertising(int n){
        int[] sharedArray=new int[n];
        int[] likedArray=new int[n];
        int[] cumulativeArray=new int[n];
        int cumulative=0;
        int lik=0;
        int shared=5;

        for(int i=0;i<n;i++){

            int liked=shared/2;
            lik=liked;
            cumulative+=lik;

            sharedArray[i]=shared;

            shared=shared/2*3;
            likedArray[i]=lik;
            cumulativeArray[i]=cumulative;
        }
        return cumulativeArray[n-1];
    }
}
