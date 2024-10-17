package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int t=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer>apples=new ArrayList<>(m);
        ArrayList<Integer>oranges=new ArrayList<>(n);

        for(int i=0;i<m;i++){
            apples.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            oranges.add(sc.nextInt());
        }
        countApplesAndOranges(s,t,a,b,apples,oranges);
        sc.close();
    }
    public static void countApplesAndOranges(int s, int t, int a, int b, ArrayList<Integer>apples,ArrayList<Integer>oranges){

        ArrayList<Integer>applesArray=new ArrayList<>();
        ArrayList<Integer>orangesArray=new ArrayList<>();
        int applesCount=0;
        int orangesCount=0;

        for(int i=0;i<apples.size();i++){
        applesArray.add(apples.get(i)+a);
        }

        for(int i=0;i<oranges.size();i++){
            orangesArray.add(oranges.get(i)+b);
        }

        for(int i=0;i<applesArray.size();i++){
            if(applesArray.get(i)>=s&&applesArray.get(i)<=t){
                applesCount++;
            }
        }

        for(int i=0;i<orangesArray.size();i++){
            if(orangesArray.get(i)>=s&&orangesArray.get(i)<=t){
                orangesCount++;
            }
        }
        System.out.println(applesCount);
        System.out.println(orangesCount);
        System.out.println(orangesCount);
    }
}
