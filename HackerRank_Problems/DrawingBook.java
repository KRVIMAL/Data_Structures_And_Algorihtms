package HackerRank_Problems;

import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int result=pageCount(n,p);
        System.out.println(result);
    }
    public static int  pageCount(int n,int p){

        int totalFlip=n/2;
        int totalFrontFlip=p/2;
        int totalBackFlip=totalFlip-totalFrontFlip;
        int result=Math.min(totalFrontFlip,totalBackFlip);
        return result;
    }
}
