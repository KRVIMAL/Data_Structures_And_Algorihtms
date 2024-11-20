package HackerRank_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] height=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }

        System.out.println(hurdleRace(k,height));
    }
    public static int hurdleRace(int k,int[] height){
        Arrays.sort(height);
        int max=height[height.length-1];
        if(max>k){
            return max-k;
        }else {
            return 0;
        }
    }
}
