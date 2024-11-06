package HackerRank_Problems;

import java.util.Objects;
import java.util.Scanner;

public class CountValley {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr=sc.nextLine();


        int result=countValley(arr);
        System.out.println(result);
    }
    public static int countValley(String arr){
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length();i++){
//            if(arr.charAt(i)=="U"){
//                sum++;
//                System.out.println(sum+"sumU");
//
//            } else  {
//
//                System.out.println(sum+"sumD");
//                if(sum==0){
//                    count++;
//                }
//                sum--;
//            }



        }
        return count;
    }
}
