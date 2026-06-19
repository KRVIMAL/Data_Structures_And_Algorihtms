package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        for(int k=0;k<list.size()-2;k++){
            for(int j=k+1;j<list.size()-1;k++){
                for(int i=j+1;i<list.size();k++){
                    int sum=list.get(i)+list.get(j)+list.get(k);
                    System.out.println(sum);
                }
            }
        }

    }
}
