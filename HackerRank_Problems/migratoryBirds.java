package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class migratoryBirds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        int result=migratoryBirds(arr);
        System.out.println(result);
    }
    public static int migratoryBirds(ArrayList<Integer>arr){
        Collections.sort(arr);
        int count=0;
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        return count;
    }
}
