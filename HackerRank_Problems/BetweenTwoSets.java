package HackerRank_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr1=new int[m];
        int[] arr2=new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();

        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int result=betweenTwoSets(arr1,arr2);
        System.out.println(result);
    }
    public  static int betweenTwoSets(int[] arr1,int[] arr2){
        int min=arr1.length-1;
        int max=arr2[0];
        int count=0;
        for(int i=min;i<=max;min++){
            if(min%arr1[i]==0&&arr2[i]%max==0){
                count++;
            }
        }
        return count;
    }

}
