package Hashing;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class HashMap{
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>(n);
        Map<Integer,Integer> hash=new java.util.HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
            int g=hash.getOrDefault(arr.get(i),0);
            hash.put(arr.get(i),g+1);
        }
        System.out.println(hash);
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int Query=sc.nextInt();
            int count=hash.getOrDefault(Query,0);
            System.out.println(count);
        }
    }
}
