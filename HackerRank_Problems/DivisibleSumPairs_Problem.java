package HackerRank_Problems;
import java.util.*;
public class DivisibleSumPairs_Problem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ArrayList<Integer>ar=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            ar.add(sc.nextInt());
        }
        int result=divisibleSumPairs(n,ar,k);
        System.out.println(result);
        sc.close();
    }
    public static int divisibleSumPairs(int n,ArrayList<Integer>ar,int k){
        int count=0;
        for(int i=0;i<ar.size();i++){
            for(int j=i+1;j<ar.size();j++){
                int result =ar.get(i)+ar.get(j);
                if(result%k==0){
                    count++;
                }
            }
        }
        return count;
    }
}