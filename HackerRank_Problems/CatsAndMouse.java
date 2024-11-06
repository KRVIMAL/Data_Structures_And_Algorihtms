package HackerRank_Problems;

import java.util.Scanner;

public class CatsAndMouse {
    public  static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();

            String result=CatAndMouse(x,y,z);
            System.out.println(result);
        }
    }
    public static String CatAndMouse(int x,int y,int z){
        int result1=Math.abs(z-x);
        int result2=Math.abs(z-y);
        if(result1>result2){
            return "Cat B";
        }
        else if(result2>result1){
            return "Cat A";
        }
        else {
            return "Mouse C";
        }
    }
}
