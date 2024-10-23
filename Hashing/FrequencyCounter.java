package Hashing;

import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        int numberOfQueries=sc.nextInt();

        for(int i=0;i<numberOfQueries;i++){
            int query=sc.nextInt();
            int count=0;
            for(int j=0;j<n;j++){
                if(list.get(j)==query){
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
