package Array;

import java.util.Scanner;

public class ArrayWithUserInput {


    public static void printArray(int[] arr){
    for(int x:arr){
        System.out.print(x + ",");
    }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
    for(int i=0;i<marks.length;i++){
        marks[i]=sc.nextInt();
    }
    printArray(marks);
    }

}
