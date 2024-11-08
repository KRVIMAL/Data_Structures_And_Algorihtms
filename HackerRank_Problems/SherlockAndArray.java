package HackerRank_Problems;
import java.util.*;
public class SherlockAndArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p= sc.nextInt();

    for(int i=0;i<p;i++){
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
       String result= balancedSums(arr);
        System.out.println(result);
        }
    }
    public static String balancedSums(int[] arr) {
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int num : arr) {
            if (leftSum == totalSum - leftSum - num) {
                return "YES";
            }
            leftSum += num;
        }

        return "NO";
    }
}
