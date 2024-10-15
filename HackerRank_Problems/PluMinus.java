package HackerRank_Problems;
import java.util.*;

public class PluMinus {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer>arr=new ArrayList<>(n);
    for(int i=0;i<n;i++){
        arr.add(sc.nextInt());
    }
    plusMinus(arr);
}
public static void plusMinus(ArrayList<Integer>arr){
    float positive=0;
    float negative=0;
    float zero=0;
    for(int i=0;i<arr.size();i++){
        if(arr.get(i)>=1){
            positive++;
        } else if (arr.get(i)<=-1) {
            negative++;
        }else {
            zero++;
        }
    }
    System.out.printf("%.6f%n",positive/arr.size());
    System.out.printf("%.6f%n",negative/arr.size());
    System.out.printf("%.6f%n",zero/arr.size());
}
}
