package Leetcode_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Leetcode_34{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int[] arr= Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println();
        int start=-1;
        int end=-1;
//        int[] newArr =Arrays.toString(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("value of i is " + i);
            if(arr[i]==target){
                start=i;
                System.out.println("start " + start);
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){

                end=i;
                System.out.println("end"+ end);
                break;
            }
        }
        System.out.println("Array elements are " + Arrays.toString(arr));
    }
}