package HackerRank_Problems;
import java.util.*;

public class HalloweenSale {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int d=sc.nextInt();
        int m=sc.nextInt();
        int s=sc.nextInt();

        int result=howManyGames(p,d,m,s);
        System.out.println(result);
    }

    public static int howManyGames(int p,int d,int m,int s){
        int sum=p;
        int count=0;
        while(s>=sum){
            s-=sum;
            count++;
            sum=Math.max(m,sum-d);
        }
        return count;
    }
}