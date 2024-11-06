package HackerRank_Problems;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=0;
        for(int i=0;i<n;i++){
            number=sc.nextInt();
            System.out.println(findOneDigit(number));
        }
    }

    public static int findOneDigit(int digit){
        int count=0;
        int original=digit;
        while (digit>0){
         int    remainder=digit%10;
         if(remainder!=0){
             if(original % remainder == 0){
                 count++;
             }
         }

            digit=digit/10;
        }
        return count;

    }

}
