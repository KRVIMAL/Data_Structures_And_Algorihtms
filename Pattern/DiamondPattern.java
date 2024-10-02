package Pattern;

import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The value of n is "+n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*((n-1)-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
//            System.out.println();
        }
    }
}
