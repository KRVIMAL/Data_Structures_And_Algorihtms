package HackerRank_Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class TheBirthDayProblem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> squares =new ArrayList<>();
        for(int i=0;i<n;i++){
            squares .add(sc.nextInt());

        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        int result=birthday(squares,d,m);
        System.out.println(result);
    }

    public static int birthday(ArrayList<Integer> s, int d, int m) {
        int count = 0;

        for (int i = 0; i <= s.size() - m; i++) {
            int sum = 0;

            for (int j = 0; j < m; j++) {
                sum += s.get(i + j);
            }

            if (sum == d) {
                count++;
            }
        }

        return count;
    }
}
