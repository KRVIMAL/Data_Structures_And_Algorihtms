package Array;

import java.util.Scanner;
public class SumAndMulOfArrayElements{
    public static void main(String[] args){
        int[] arr= new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int mul=1;
        for(int i=0;i<arr.length;i++)
        {

            sum+=arr[i];
            mul*=arr[i];
        }

        System.out.println(sum);
        System.out.println(mul);
        sc.close();
    }
}
