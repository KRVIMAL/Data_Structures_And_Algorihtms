package HackerRank_Problems;
import java.util.*;
public class SequenceEquation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=1;i<=n;i++){
            int value= sc.nextInt();
            mp.put(value,i);
        }
        for(int i=1;i<=n;i++){
            int x=mp.get(i);
            int y=mp.get(x);
            System.out.println(y+"y");
        }
    }
}