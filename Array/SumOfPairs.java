package Array;
import java.util.Scanner;
import java.util.ArrayList;

public class SumOfPairs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                sum+=list.get(i)+list.get(j);
            }
        }
        System.out.println(sum);
    }
}