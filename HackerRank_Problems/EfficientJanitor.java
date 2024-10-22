package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class EfficientJanitor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextInt();
        ArrayList<Float> weight=new ArrayList<>();
        for (int i=0;i<n;i++){
        weight.add((float) i);
        }
        int result=efficientJanitor(weight);
        System.out.println(result);
    }
    public  static  int efficientJanitor(ArrayList<Float>weight) {
    int sum=0;
        for(int i=0;i<weight.size();i++){
        sum+=weight.get(i);

    }
        return  sum;
    }
}
