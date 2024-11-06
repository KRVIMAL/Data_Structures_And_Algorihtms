package HackerRank_Problems;
import java.util.*;
public class BeautifulDays {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n=sc.nextInt();
        int k=sc.nextInt();
        int result=beautifulDays(m,n,k);
        System.out.println(result);

    }
    public static int reverse(int number){
        int reverse=0;
        while (number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number/=10;
        }
        return reverse;
    }

    public static int beautifulDays(int m,int n,int k){
        int result=0;
        int count=0;
        for(int i=m;i<=n;i++){
           result=Math.abs(i-reverse(i));
            if(result%k!=0){
                count++;
            }
        }
        return count;
    }
    }
