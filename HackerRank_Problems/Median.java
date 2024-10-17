package HackerRank_Problems;
import java.util.*;

public class Median{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=findMedian(arr);
        System.out.println(result);
    }
    public static int findMedian(int[] arr){
        Arrays.sort(arr);
        int mid=arr.length/2;
        return arr[mid];
    }
}