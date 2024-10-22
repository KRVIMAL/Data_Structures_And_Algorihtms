package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBirthdayBar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        ArrayList<Integer>squares=new ArrayList<>();
        for (int i=0;i<n;i++){
            squares.add(i);
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int result=birthday(n,squares, d,m);
        System.out.println(result);

    }
    public static  int  birthday(int n,ArrayList<Integer> squares,int d,int m){
        for(int i=0;i<squares.size();i++){

        }
        return n;

    }
}
